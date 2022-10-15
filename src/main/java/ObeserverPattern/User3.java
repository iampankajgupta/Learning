package ObeserverPattern;

public class User3 implements Observer{
    @Override
    public void update(String msg) {
        System.out.println("User 3 "+msg);
    }
}
