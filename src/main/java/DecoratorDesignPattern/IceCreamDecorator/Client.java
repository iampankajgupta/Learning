package DecoratorDesignPattern.IceCreamDecorator;

public class Client {
  public static void main(String[] args) {
//    IceCream iceCream = new StrawBerrySyrupDecorator(new ChocoChipsDecorator(new ButterScotchIceCream()));

    // both are same
    IceCream iceCream = new ButterScotchIceCream();
    iceCream = new StrawBerrySyrupDecorator(iceCream);
    iceCream = new ChocoChipsDecorator(iceCream);

    System.out.println(iceCream.cost());
    System.out.println(iceCream.getDescription());

  }
}
