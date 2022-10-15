package ObeserverPattern;

import java.io.IOException;
import java.util.ArrayList;

public class YoutubeChannel1 implements Subject{
    ArrayList<Observer>observerArrayList;

    public YoutubeChannel1() {
        this.observerArrayList = new ArrayList<>();
    }

    // add observer
    @Override
    public void registerObserver(Observer o) {
        observerArrayList.add(o);
    }

    // remove observer
    @Override
    public void unregisterObserver(Observer o) {
        int index = observerArrayList.indexOf(o);
        if(index>=0){
            observerArrayList.remove(index);
        }else {
            // throw EXception
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
