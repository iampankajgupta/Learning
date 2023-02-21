package DecoratorDesignPattern;

public class Main {
  public static void main(String[] args) {
    BasePizza farmHousePizza = new Mushroom(new ExtraCheese(new FarmHousePizza()));
    System.out.println(farmHousePizza.cost());
  }
}
