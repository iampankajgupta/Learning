package StrategyDesignPattern.VehicleExample;

public class Client {
  public static void main(String[] args) {
    Vehicle vehicle = new GoodsVehicle();
    Vehicle vehicle2 = new OffRoadVehicle();
    vehicle2.drive();
    vehicle.drive();
  }
}
