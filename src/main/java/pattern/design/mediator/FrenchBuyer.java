package pattern.design.mediator;

public class FrenchBuyer extends Buyer {

  public FrenchBuyer(Mediator mediator, String unitOfCurrency) {
    super(mediator, "EURO");
    mediator.registerFrenchBuyer(this);
  }

}
