package DecoratorDesignPattern.IceCreamDecorator;

public class ButterScotchIceCream extends IceCream{

  @Override
  String getDescription() {
    return "Butter Scotch Icecream With ";
  }

  @Override
  int cost() {
    return 50;
  }
}
