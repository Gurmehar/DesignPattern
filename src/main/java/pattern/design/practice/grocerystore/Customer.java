package pattern.design.practice.grocerystore;

import java.util.LinkedList;
import java.util.List;


public class Customer {
  
  private GroceryStore store;
  private List<Item> shoppingList= new LinkedList<Item>();
  private Cashier cashier;
  private Float myMoney=100000f;
  private float discountCoupon;
  
  
  
  

  public float getDiscountCoupon() {
    return discountCoupon;
  }

  public void setDiscountCoupon(float discountCoupon) {
    this.discountCoupon = discountCoupon;
  }

  public Customer(GroceryStore store) {
    super();
    this.store = store;
  }

  public final void shop() {
    addItem();
    checkout();
    
  }

  private void checkout() {
    cashier=store.getCashier();
    float total=cashier.getBill(shoppingList);
    
    myMoney=myMoney-total;
    cashier.pay(total);
    
    System.out.println("Thanks for Shopping "+ shoppingList+ " \n for amount "+ total);
    
  }

  private void addItem() {
    shoppingList.add(store.getItemList().get(0));
    
    shoppingList.add(store.getItemList().get(2));
    shoppingList.add(store.getItemList().get(3));
    
    
  }
  
  

}
