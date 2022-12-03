package StrategyDesignPattern.VehicleExample;

public class GoodsVehicle extends Vehicle{
  public GoodsVehicle() {
    super(new NormalDrive());
  }
}
