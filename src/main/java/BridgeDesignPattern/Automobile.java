package BridgeDesignPattern;

public abstract class Automobile {
  protected Workshop workshop;
  protected Workshop workshop2;

  protected Automobile(Workshop workshop,Workshop workshop2){
    this.workshop = workshop;
    this.workshop2 = workshop2;
  }

  abstract void manufacture();
}
