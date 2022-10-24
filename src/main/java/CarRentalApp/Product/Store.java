package CarRentalApp.Product;

import java.util.ArrayList;
import java.util.List;

public class Store {
  int storeId;
  Location location;
  VehicleInventory vehicleInventory;
  List<Reservation> reservations = new ArrayList<>();


  public Reservation createReservation(Vehicle vehicle, User user){
    Reservation reservation = new Reservation();
    reservation.createReservation(vehicle,user);
    reservations.add(reservation);
    return reservation;
  }

  public int getStoreId() {
    return storeId;
  }

  public VehicleInventory getVehicleInventory() {
    return vehicleInventory;
  }

  public void setVehicleInventory(VehicleInventory vehicleInventory) {
    this.vehicleInventory = vehicleInventory;
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

  // Vehicle Inventory Manages all the storing and getting vehicles
  public List<Vehicle> getVehicles(VehicleType bike) {
    return InventoryFactory.getVehicleFactory(bike).getVehicles();
  }

  public void setVehicles(List<Vehicle> vehicles,VehicleType vehicleType) {
     this.vehicleInventory = InventoryFactory.getVehicleFactory(vehicleType);
     vehicleInventory.setVehicles(vehicles);
  }

  public List<Reservation> getReservations() {
    return reservations;
  }

  public void setReservations(List<Reservation> reservations) {
    this.reservations = reservations;
  }

  public boolean completeReservation() {
    return true;
  }
}
