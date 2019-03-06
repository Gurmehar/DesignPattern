package pattern.design.mediator;

public class Mediator {
  private Buyer indianBuyer;
  private Buyer frenchBuyer;  
  private DollarConverter dollarConverter;
  private AmericanSeller americaSeller;
  
  
  public boolean placeBid(float bid, String unitOfCurrency) {
    float dollar=dollarConverter.convertCurrenyToDollar(bid,unitOfCurrency);
    
    return americaSeller.isBidAccepted(dollar);
   
  }


  public void registerDollarConverter(DollarConverter dollarConverter2) {
   this.dollarConverter=dollarConverter2;
  }
  
  public void  registerIndianBuyer( Buyer buyer){
    this.indianBuyer=buyer;
  }
  
  public void  registerFrenchBuyer( Buyer buyer){
    this.frenchBuyer=buyer;
  }


  public void registerAmericanSeller(AmericanSeller americanSeller) {
    this.americaSeller=americanSeller;
    
  }

}
