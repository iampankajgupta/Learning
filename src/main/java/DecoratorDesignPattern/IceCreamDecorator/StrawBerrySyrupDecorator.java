package DecoratorDesignPattern.IceCreamDecorator;

public class StrawBerrySyrupDecorator extends IceCreamDecorator{
  IceCream iceCream;

  public StrawBerrySyrupDecorator(IceCream iceCream) {
    this.iceCream = iceCream;
  }

  @Override
  String getDescription() {
    return iceCream.getDescription() + "StrawBerrySyrupDecorator Added";
  }

  @Override
  int cost() {
    return iceCream.cost()+100;
  }
}
