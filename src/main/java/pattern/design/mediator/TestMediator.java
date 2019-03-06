package pattern.design.mediator;

public class TestMediator {
  
  public static void main(String[] args) {
    Mediator mediator= new Mediator();
    IndianBuyer indianBuyer= new IndianBuyer(mediator, "");
    FrenchBuyer frenchBuyer= new FrenchBuyer(mediator, "");
    float sellingDollarPrice=115f;
    AmericanSeller americanSeller= new AmericanSeller(mediator, sellingDollarPrice);
    DollarConverter dollarConverter= new DollarConverter(mediator);
    
    float bid=45.0f;
    
    while(!indianBuyer.attemptToPurchase(bid)){
        bid=bid+500.0f;
    }
    bid=0.f;
    
    
    while(!frenchBuyer.attemptToPurchase(bid)){
      bid=bid+10.0f;
  }
    
  }

}
