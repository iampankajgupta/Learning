package NullObjectPattern;

public class Client {
  // Description
  // 1. A null object replaces NULL return type
  // 2. No need to put if check for Checking NULL
  // 3. Null Object reflects do Nothing or default behaviour
  // 4. isme kya hai ek simple nya Null object joh implement krge joh Car class implment kr rha hai  banana hai if null statisfy hoga to usk k jagah voh Nullobject return krna hai
  public static void main(String[] args) {
    Vehicle car = VehicleFactory.getVehicleInstance("Car");
    printVehicleDetails(car);
    Vehicle bike = VehicleFactory.getVehicleInstance("bike");
    printVehicleDetails(bike);
  }

  private static void printVehicleDetails(Vehicle vehicle){
    System.out.println(vehicle.getTankCapacity() + " ---> "+vehicle.getSeatCapacity());
  }
}
