package pattern.design.mediator;

public class Buyer {
  
  private Mediator mediator;
  private String unitOfCurrency;
  
  
  public Buyer(Mediator mediator, String unitOfCurrency) {
    super();
    this.mediator = mediator;
    this.unitOfCurrency = unitOfCurrency;
  }
  
  public boolean attemptToPurchase(float bid){
    System.out.println("Bid Attempted of "+ bid+ unitOfCurrency);
    return mediator.placeBid(bid,unitOfCurrency);
  }
  

}
