package ParkingLot.Example;

import java.util.HashMap;
import java.util.List;

public class ParkingLot {

    HashMap<Integer,ParkingSpot[]> parkingFloors;

    public ParkingLot(int parkingFloor,) {
        parkingFloors = new HashMap<>(2);
    }

    // park a vehicle



    public Ticket parkVehicle(Vehicle vehicle){
        // iterate each and every floor and check in any floor if vehicle can ve park

    }

    // unpark a vehicle

    public void unParkVehicle(Ticket ticket){
        List<ParkingSpot> parkingSpotList = parkingFloors.get(ticket.getLocation().getFloorId());
        if(parkingSpotList!=null && !parkingSpotList.isEmpty()){

        }

    }

}
