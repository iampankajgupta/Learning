package StrategyDesignPattern.VehicleExample;

import StrategyDesignPattern.VehicleExample.Strategy.DriveStrategy;

public class Vehicle {
  DriveStrategy driveStrategy;
  public Vehicle(DriveStrategy driveStrategy) {
    this.driveStrategy = driveStrategy;
  }
  public void drive(){
    driveStrategy.drive();
  }
}
