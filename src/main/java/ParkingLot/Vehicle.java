package ParkingLot;

public class Vehicle {
  private int id;
  private String registrationNumber;
  private VehicleType vehicleType;

  public Vehicle() {
  }

  public Vehicle(int id, String registrationNumber, VehicleType vehicleType) {
    this.id = id;
    this.registrationNumber = registrationNumber;
    this.vehicleType = vehicleType;
  }

  private Vehicle(Builder builder) {
    this.id = builder.id;
    this.registrationNumber = builder.registrationNumber;
    this.vehicleType = builder.vehicleType;
  }

  public static class Builder{

    private int id;
    private String registrationNumber;
    private VehicleType vehicleType;


    public Builder setId(int id) {
      this.id = id;
      return this;
    }

    public Builder setRegistrationNumber(String registrationNumber) {
      this.registrationNumber = registrationNumber;
      return this;
    }

    public Builder setVehicleType(VehicleType vehicleType) {
      this.vehicleType = vehicleType;
      return this;
    }

    public Vehicle build(){
      return new Vehicle(this);
    }

  }

  @Override
  public String toString() {
    return "Vehicle{" +
        "id=" + id +
        ", registrationNumber='" + registrationNumber + '\'' +
        ", vehicleType=" + vehicleType +
        '}';
  }
}
