package CarRentalApp.Product;

import java.util.List;

public class Store {
  int storeId;
  Location location;
  List<Vehicle> vehicles;
  VehicleInventory vehicleInventory;
  List<Reservation> reservations;

  public int getStoreId() {
    return storeId;
  }

  public void setStoreId(int storeId) {
    this.storeId = storeId;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public List<Vehicle> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }

  public VehicleInventory getVehicleInventory() {
    return vehicleInventory;
  }

  public void setVehicleInventory(VehicleInventory vehicleInventory) {
    this.vehicleInventory = vehicleInventory;
  }

  public List<Reservation> getReservations() {
    return reservations;
  }

  public void setReservations(List<Reservation> reservations) {
    this.reservations = reservations;
  }
}
