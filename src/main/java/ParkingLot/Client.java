package ParkingLot;

public class Client {
  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle.Builder().setVehicleType(VehicleType.TWO_WHEELER).setRegistrationNumber("hfgh").build();
    System.out.println(vehicle);
  }
}
