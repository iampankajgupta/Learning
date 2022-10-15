package ObeserverPattern;

public class User2 implements Observer{
    @Override
    public void update(String msg) {
        System.out.println("User 2 "+msg);
    }
}
