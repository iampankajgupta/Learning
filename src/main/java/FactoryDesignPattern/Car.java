package FactoryDesignPattern;

public class Car extends Vehicle {
  int wheel;

  @Override
  int getWheel() {
    return this.wheel;
  }

  public Car(int wheel) {
    this.wheel = wheel;
  }
}
