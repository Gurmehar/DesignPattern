package pattern.design.adapter;

import com.google.gson.Gson;

public class Test {
  private static final String DEFAULTADDRESSJSON ="{\"county\":\"Hampshire\",\"grideasting\":464457,\"gridnorthing\":102659,\"latitude\":50.8198860508,\"longitude\":-1.0863224684,\"postcode\":\"PO2 8QD\",\"posttown\":\"Portsmouth\",\"premise\":\"89\",\"street\":\"Gruneisen Road\",\"summaryline\":\"89 Gruneisen Road, Portsmouth, Hampshire, PO2 8QD\"}";
  public static void main(String[] args) throws Exception {

    PostCoderAddressUtility addressUtil = null;
   

    Gson gson = new Gson();
    addressUtil = gson.fromJson( DEFAULTADDRESSJSON , PostCoderAddressUtility.class);
    System.out.println("AddressUtility ::" + addressUtil);

  /* Address address= new AddressUtilityWrapper(addressUtil).fromPostCoder();
    
    
    Address address2=(Address) Class.forName("pattern.design.adapter.Address").newInstance();
    System.out.println(address2);*/
    
   
    
  }
}
