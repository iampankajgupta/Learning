package ParkingLot;

public class Slot {
  private int id;
  private Vehicle vehicle;
  private int price;
  private boolean isEmpty;

  public Slot(){
    this.isEmpty = true;
  }

  public void parkVehicle(Vehicle vehicle){
    this.vehicle = vehicle;
    this.isEmpty = false;
  }

  public void removeVehicle(Vehicle vehicle){
    this.vehicle = null;
    this.isEmpty = true;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public boolean isEmpty() {
    return isEmpty;
  }

  public void setEmpty(boolean empty) {
    isEmpty = empty;
  }
}
