package HotelManagementSystem;

import HotelManagementSystem.Enum.RoomStatus;
import HotelManagementSystem.Enum.RoomStyle;

import java.util.List;

public class Room {
  String roomNumber;
  RoomStyle roomStyle;
  RoomStatus roomStatus;
  Double bookingPrice;
  List<RoomKey> roomKeys;
  List<HouseKeepingLog>houseKeepingLogs;


}
