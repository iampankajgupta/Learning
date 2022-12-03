package StrategyDesignPattern.VehicleExample;

public class Vehicle {

  DriveStrategy driveStrategy;

  public Vehicle(DriveStrategy driveStrategy) {
    this.driveStrategy = driveStrategy;
  }

  public void drive(){
    driveStrategy.drive();;
  }

  public DriveStrategy getDriveStrategy() {
    return driveStrategy;
  }

  public void setDriveStrategy(DriveStrategy driveStrategy) {
    this.driveStrategy = driveStrategy;
  }
}
