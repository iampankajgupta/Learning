package ParkingLot;

import java.util.List;

public class ParkingSpotManager {
  List<Slot> parkingSpots;
  ParkingStrategy parkingStrategy;

  public ParkingSpotManager(List<Slot> parkingSpots,ParkingStrategy parkingStrategy) {
    this.parkingSpots = parkingSpots;
    this.parkingStrategy = parkingStrategy;
  }

  public ParkingSpotManager(List<Slot> parkingSpots) {
  }


  // find Parking Space
  // add Parking Space
  // parking vehicle
  // remove vehicle
}
