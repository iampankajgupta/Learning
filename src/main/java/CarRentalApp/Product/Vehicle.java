package CarRentalApp.Product;

import java.util.Date;

public class Vehicle {
  int vehicleId;
  int vehicleNumber;
  String modelName;
  String companyName;
  Date manufacturingDate;
  VehicleType vehicleType;
  int kmDriven;
  int average;
  int cc;
  int dailyRentalCost;
  int hourlyRentalCost;
  int noOfSeat;
  Status status;

  public int getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(int vehicleId) {
    this.vehicleId = vehicleId;
  }

  public int getVehicleNumber() {
    return vehicleNumber;
  }

  public void setVehicleNumber(int vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }

  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Date getManufacturingDate() {
    return manufacturingDate;
  }

  public void setManufacturingDate(Date manufacturingDate) {
    this.manufacturingDate = manufacturingDate;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  public int getKmDriven() {
    return kmDriven;
  }

  public void setKmDriven(int kmDriven) {
    this.kmDriven = kmDriven;
  }

  public int getAverage() {
    return average;
  }

  public void setAverage(int average) {
    this.average = average;
  }

  public int getCc() {
    return cc;
  }

  public void setCc(int cc) {
    this.cc = cc;
  }

  public int getDailyRentalCost() {
    return dailyRentalCost;
  }

  public void setDailyRentalCost(int dailyRentalCost) {
    this.dailyRentalCost = dailyRentalCost;
  }

  public int getHourlyRentalCost() {
    return hourlyRentalCost;
  }

  public void setHourlyRentalCost(int hourlyRentalCost) {
    this.hourlyRentalCost = hourlyRentalCost;
  }

  public int getNoOfSeat() {
    return noOfSeat;
  }

  public void setNoOfSeat(int noOfSeat) {
    this.noOfSeat = noOfSeat;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }
}
