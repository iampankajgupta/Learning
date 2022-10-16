package FactoryDesignPattern;

public class Client {

  public static void main(String[] args) {
    Vehicle bike = VehicleFactory.getInstance("bike",2);
    Vehicle car = VehicleFactory.getInstance("car",4);
    System.out.println(bike.getWheel());
    System.out.println(car.getWheel());

  }


}
