package CarRentalApp.Product;

public class Location {
  String address;
  String city;
  String pinCode;
  String state;

  public Location(String address, String city, String pinCode, String state) {
    this.address = address;
    this.city = city;
    this.pinCode = pinCode;
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getPinCode() {
    return pinCode;
  }

  public void setPinCode(String pinCode) {
    this.pinCode = pinCode;
  }
}
