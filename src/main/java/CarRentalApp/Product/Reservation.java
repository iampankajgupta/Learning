package CarRentalApp.Product;

import java.util.Date;

public class Reservation {
  int reservationId;
  User user;
  Vehicle vehicle;
  Date bookedDate;
  Date bookedFrom;
  Date bookedTill;
  Location pickUpLocation;
  Location dropLocation;
  ReservationType reservationType;
  ReservationStatus reservationStatus;
  Location location;

  public Location getPickUpLocation() {
    return pickUpLocation;
  }

  public void setPickUpLocation(Location pickUpLocation) {
    this.pickUpLocation = pickUpLocation;
  }

  public Location getDropLocation() {
    return dropLocation;
  }

  public void setDropLocation(Location dropLocation) {
    this.dropLocation = dropLocation;
  }

  public ReservationType getReservationType() {
    return reservationType;
  }

  public void setReservationType(ReservationType reservationType) {
    this.reservationType = reservationType;
  }

  public ReservationStatus getReservationStatus() {
    return reservationStatus;
  }

  public void setReservationStatus(ReservationStatus reservationStatus) {
    this.reservationStatus = reservationStatus;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public int getReservationId() {
    return reservationId;
  }

  public void setReservationId(int reservationId) {
    this.reservationId = reservationId;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Date getBookedDate() {
    return bookedDate;
  }

  public void setBookedDate(Date bookedDate) {
    this.bookedDate = bookedDate;
  }

  public Date getBookedFrom() {
    return bookedFrom;
  }

  public void setBookedFrom(Date bookedFrom) {
    this.bookedFrom = bookedFrom;
  }

  public Date getBookedTill() {
    return bookedTill;
  }

  public void setBookedTill(Date bookedTill) {
    this.bookedTill = bookedTill;
  }

  public int createReservation(Vehicle vehicle, User user) {
    reservationId = 12324;
    this.user = user;
    this.vehicle = vehicle;
    reservationType = ReservationType.DAILY;
    reservationStatus = ReservationStatus.SCHEDULED;
    return reservationId;
  }
}
