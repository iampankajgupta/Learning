package CarRentalApp.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class VehicleInventory {

  // based on the filter applied return the list of Objects
  // VehicleType let say CAR or Bike
  public abstract List<Vehicle> getVehicles();

  public abstract void setVehicles(List<Vehicle> vehicles);
}
