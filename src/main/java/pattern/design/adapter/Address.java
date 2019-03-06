package pattern.design.adapter;

import java.util.Arrays;

public class Address {
  
  private String addressLine1;

  private String addressLine2;

  private String city;

  private String state;

  private String country;

  private String pinCode;

  private Double[] position = {};

  private String streetAddress;

  private String timeZoneID;

  private String county;

  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getPinCode() {
    return pinCode;
  }

  public void setPinCode(String pinCode) {
    this.pinCode = pinCode;
  }

  public Double[] getPosition() {
    return position;
  }

  public void setPosition(Double[] position) {
    this.position = position;
  }

  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public String getTimeZoneID() {
    return timeZoneID;
  }

  public void setTimeZoneID(String timeZoneID) {
    this.timeZoneID = timeZoneID;
  }

  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }
  
  public Address(){}
  public Address(String addressLine1, Double [] position, String city,
      String pinCode, String county, String streetAddress) {
    super();
    this.addressLine1 = addressLine1;
    this.position=position;
    this.city = city;
    this.pinCode = pinCode;
    this.county=county;
    this.streetAddress=streetAddress;
  }


  @Override
  public String toString() {
    return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city="
        + city + ", state=" + state + ", country=" + country + ", pinCode=" + pinCode
        + ", position=" + Arrays.toString(position) + ", streetAddress=" + streetAddress
        + ", timeZoneID=" + timeZoneID + ", county=" + county + "]";
  }



}
