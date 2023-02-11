package StrategyDesignPattern.VehicleExample;

import StrategyDesignPattern.VehicleExample.Strategy.OffRoadStrategy;

public class OffRoadVehicle extends Vehicle{
  public OffRoadVehicle() {
    super(new OffRoadStrategy());
  }
}
