package pattern.design.mediator;

public class IndianBuyer extends Buyer {

  public IndianBuyer(Mediator mediator, String unitOfCurrency) {
    super(mediator, "INR");
    mediator.registerIndianBuyer(this);
  }

}
