package StrategyDesignPattern.VehicleExample;

public class NormalDrive implements DriveStrategy{
  @Override
  public void drive() {
    System.out.println("Normal Drive Called....");
  }
}
