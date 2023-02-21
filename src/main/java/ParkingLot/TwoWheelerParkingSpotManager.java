package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{

  List<Slot> parkingSpots = new ArrayList<>();
  ParkingStrategy parkingStrategy = new NearestToEntrance();
  public TwoWheelerParkingSpotManager(List<Slot> parkingSpots,ParkingStrategy parkingStrategy) {
    super(parkingSpots,parkingStrategy);
  }

}
