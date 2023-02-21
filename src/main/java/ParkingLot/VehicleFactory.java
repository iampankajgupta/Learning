package ParkingLot;

public class VehicleFactory {

  public static Vehicle getVehicleInstance(String vehicleType){
    if(vehicleType.equalsIgnoreCase(VehicleType.TWO_WHEELER.toString())){
      return new TwoWheeler();
    }else if(vehicleType.equalsIgnoreCase(VehicleType.FOUR_WHEELER.toString())){
      return new FourWheeler();
    }else return new TwoWheeler();
  }
}
