package AbstractFactoryDesignPattern;

public class Client {
  public static void main(String[] args) {
    Application application = new Application(new MacUIFactory());
    application.paint();
  }
}
