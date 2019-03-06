package pattern.design.mediator;

public class DollarConverter {
  
  public static final float INR_UNIT=45.0f;
  public static final float DOLLAR_UNIT=1.0f;
  public static final float EURO_UNIT=0.7f;
  
  private Mediator mediator;
  
  
  

  public DollarConverter(Mediator mediator) {
    super();
    this.mediator = mediator;
    mediator.registerDollarConverter(this);
  }




  public float convertCurrenyToDollar(float bid, String unitOfCurrency) {
    System.out.println("Bid ::"+bid +" of Curreny ::"+ unitOfCurrency);
   if("INR".equals(unitOfCurrency)){
     return  bid*DOLLAR_UNIT/INR_UNIT;
   }else if("EURO".equals(unitOfCurrency)){
     return  bid*DOLLAR_UNIT/EURO_UNIT;     
   }
    return bid;
  }

}
