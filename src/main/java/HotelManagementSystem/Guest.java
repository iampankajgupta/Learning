package HotelManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Guest extends Person{
  Search obj;
  Booking bookingObj;

  public List<RoomBooking> getAllRoomBookings(){
    return new ArrayList<>();
  }


}
