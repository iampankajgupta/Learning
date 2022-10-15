package ObeserverPattern;

import java.util.ArrayList;

public class YoutubeChannel2 implements Subject{

    ArrayList<Observer> observerArrayList;

    public YoutubeChannel2() {
        observerArrayList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerArrayList.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        int index= observerArrayList.indexOf(o);
        if(index>=0) observerArrayList.remove(index);
        else {
            // throw exeception
        }
    }

    @Override
    public void notifyObserver(String msg) {
        for(Observer o:observerArrayList){
            o.update(msg);
        }
    }

    void newVideoAdded(String msg){
        notifyObserver(msg);
    }
}
