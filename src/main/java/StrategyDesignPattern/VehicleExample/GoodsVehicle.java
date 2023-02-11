package StrategyDesignPattern.VehicleExample;

import StrategyDesignPattern.VehicleExample.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
  public GoodsVehicle() {
    super(new NormalDriveStrategy());
  }
}
