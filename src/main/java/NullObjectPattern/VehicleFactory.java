package NullObjectPattern;


public class VehicleFactory {

  public static Vehicle getVehicleInstance(String typeObject){
    if(typeObject.equalsIgnoreCase("Car")) return new Car();
    return new NullObject();
  }
}
