package BuilderDesignPattern;

public class Main {
  public static void main(String[] args) {
    Burger burger = new Burger.BurgerBuilder().size("15").mayonese(true).egg(true).onion(true).lettuce(true).build();
    System.out.println(burger);
  }
}
