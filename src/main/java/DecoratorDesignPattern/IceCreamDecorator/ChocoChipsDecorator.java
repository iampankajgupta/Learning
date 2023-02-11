package DecoratorDesignPattern.IceCreamDecorator;

public class ChocoChipsDecorator extends IceCreamDecorator{
  IceCream iceCream;

  public ChocoChipsDecorator(IceCream iceCream) {
    this.iceCream = iceCream;
  }

  @Override
  String getDescription() {
    return iceCream.getDescription()+" ChocoChips Decorator Added ";
  }

  @Override
  int cost() {
    return iceCream.cost()+20;
  }
}
