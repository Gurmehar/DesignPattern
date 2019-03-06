package pattern.design.adapter;

import org.springframework.util.StringUtils;

public class AddressAdapter extends Address {

  private PostCoderAddressUtility postCoderAddressUtility;

  public AddressAdapter(PostCoderAddressUtility postCoderAddressUtility) {
    super();
    /*super(
        postCoderAddressUtility.getSummaryline().replace(", "+postCoderAddressUtility.getPostcode(), ""),
        new Double[] {postCoderAddressUtility.getLongitude(),postCoderAddressUtility.getLatitude()},
        postCoderAddressUtility.getPosttown(),
        postCoderAddressUtility.getPostcode(),
        postCoderAddressUtility.getCounty(),
        (postCoderAddressUtility.getPremise() + ", "
            +postCoderAddressUtility.getStreet())
        );*/
  
    
    this.postCoderAddressUtility = postCoderAddressUtility;
    
    
  }

  @Override
  public void setAddressLine1(String addressLine1) {
   if(StringUtils.isEmpty(this.postCoderAddressUtility.getSummaryline())){
    super.setAddressLine1("");
   }else{
     super.setAddressLine1(this.postCoderAddressUtility.getSummaryline().replace(", "+this.postCoderAddressUtility.getPostcode(), ""));
   }
  }

  
  @Override
  public Double[] getPosition() {
    // TODO Auto-generated method stub
    return new Double[] {this.postCoderAddressUtility.getLongitude(),this.postCoderAddressUtility.getLatitude()};
  }
  @Override
  public void setPosition(Double[] position) {
    // TODO Auto-generated method stub
    super.setPosition(new Double[] {this.postCoderAddressUtility.getLongitude(),this.postCoderAddressUtility.getLatitude()});
  }
  

 


}
