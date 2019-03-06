package pattern.design.adapter;

public class PostCoderAddressUtility {
  
  private String county;
  private String grideasting;
  private String gridnorthing;
  private Double latitude;
  private Double longitude;
  private String postcode;
  private String premise;
  private String street;
  private String summaryline;
  private String posttown;
  public String getCounty() {
    return county;
  }
  public void setCounty(String county) {
    this.county = county;
  }
  public String getGrideasting() {
    return grideasting;
  }
  public void setGrideasting(String grideasting) {
    this.grideasting = grideasting;
  }
  public String getGridnorthing() {
    return gridnorthing;
  }
  public void setGridnorthing(String gridnorthing) {
    this.gridnorthing = gridnorthing;
  }
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }
  public String getPostcode() {
    return postcode;
  }
  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }
  public String getPremise() {
    return premise;
  }
  public void setPremise(String premise) {
    this.premise = premise;
  }
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }
  public String getSummaryline() {
    return summaryline;
  }
  public void setSummaryline(String summaryline) {
    this.summaryline = summaryline;
  }
  public String getPosttown() {
    return posttown;
  }
  public void setPosttown(String posttown) {
    this.posttown = posttown;
  }
  
  @Override
  public String toString() {
    return "PostCoderAddressUtility [county=" + county + ", grideasting=" + grideasting
        + ", gridnorthing=" + gridnorthing + ", latitude=" + latitude + ", longitude=" + longitude
        + ", postcode=" + postcode + ", premise=" + premise + ", street=" + street
        + ", summaryline=" + summaryline + ", posttown=" + posttown + "]";
  }
  
  

}
