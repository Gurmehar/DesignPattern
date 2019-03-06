package pattern.design.mediator;

public class AmericanSeller {
  private Mediator mediator;
  private float priceInDollars;
  public AmericanSeller(Mediator mediator, float priceInDollars) {
    super();
    this.mediator = mediator;
    this.priceInDollars = priceInDollars;
    this.mediator.registerAmericanSeller(this);
  }
  public boolean isBidAccepted(float dollar) {
    System.out.println(" Bid is ::"+dollar +" price  is :: "+priceInDollars);
    return (dollar>=priceInDollars);
    
  }
  
  
  

}
