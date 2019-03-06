package pattern.design.practice.grocerystore;

import java.util.List;

public class Cashier {
  
  private GroceryStore store;
  
  public void takePosition(GroceryStore store){
    this.store=store;
  }

  public void pay(float total) {
    store.setStoreMoney(store.getStoreMoney()+total);
    
  }

  public float getBill(List<Item> shoppingList) {
    float total=0.0f;
    for (Item item : shoppingList) {
      total=total+item.getItemPrice();
    }
    return total;
  }

}
