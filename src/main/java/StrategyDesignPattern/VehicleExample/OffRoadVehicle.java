package StrategyDesignPattern.VehicleExample;

public class OffRoadVehicle extends Vehicle{
  public OffRoadVehicle() {
    super(new SpecialDrive());
  }
}