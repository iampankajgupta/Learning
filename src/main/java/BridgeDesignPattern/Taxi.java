package BridgeDesignPattern;

public class Taxi extends Automobile{
  protected Taxi(Workshop workshop, Workshop workshop2) {
    super(workshop, workshop2);
  }

  @Override
  void manufacture() {
    workshop.work();
    workshop2.work();
  }
}
