package FactoryDesignPattern;

public class VehicleFactory {

  public static Vehicle getInstance(String type,int wheel){
    if(type.equalsIgnoreCase("car")){
      return new Car(wheel);
    }else if(type.equalsIgnoreCase("bike")){
      return new Bike(wheel);
    }
    return null;
  }


}
