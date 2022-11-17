package BridgeDesignPattern;

public class Bus extends Automobile{
  protected Bus(Workshop workshop, Workshop workshop2) {
    super(workshop, workshop2);
  }

  @Override
  void manufacture() {
    workshop.work();
    workshop2.work();
  }
}
