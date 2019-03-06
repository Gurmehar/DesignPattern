package pattern.design.adapter;

import org.springframework.util.StringUtils;

public class AddressUtilityWrapper {

  private PostCoderAddressUtility postCoderAddressUtility;

  public AddressUtilityWrapper(PostCoderAddressUtility postCoderAddressUtility) {
    this.postCoderAddressUtility = postCoderAddressUtility;
  }

  public Address fromPostCoder() throws Exception {
    
    if (!StringUtils.isEmpty(this.postCoderAddressUtility)) {
      Address address = new Address();
      address.setAddressLine1(postCoderAddressUtility.getSummaryline()
          .replace(", " + postCoderAddressUtility.getPostcode(), ""));
      address.setPosition(new Double[] {postCoderAddressUtility.getLongitude(),
          postCoderAddressUtility.getLatitude()});
      address.setCity(postCoderAddressUtility.getPosttown());
      address.setPinCode(postCoderAddressUtility.getPostcode());
      address.setCounty(postCoderAddressUtility.getCounty());
      address.setStreetAddress(
          (postCoderAddressUtility.getPremise() + ", " + postCoderAddressUtility.getStreet()));
      return address;
    }else
      throw new Exception("Post Coder Address is Not avaliable");    
    
  }

}
