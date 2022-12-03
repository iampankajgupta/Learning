package HotelManagementSystem;

import HotelManagementSystem.Enum.BookingStatus;

import java.util.Date;
import java.util.List;

public class RoomBooking {
  String bookindId;
  Date startDate;
  int durationInDays;
  BookingStatus bookingStatus;
  List<Guest> guestList;
  List<Room> roomInfo;
  BaseRoomCharge totalRoomCharges;
}
