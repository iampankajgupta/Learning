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
}
