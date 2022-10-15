package FactoryDesignPattern;

public class Bike extends Vehicle{
  int wheel;

  public Bike(int wheel) {
    this.wheel = wheel;
  }

  @Override
  int getWheel() {
    return this.wheel;
  }
}
