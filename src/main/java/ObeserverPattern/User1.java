package ObeserverPattern;

public class User1 implements Observer{
    @Override
    public void update(String msg) {
        System.out.println("User 1 "+msg);
    }
}
