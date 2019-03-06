package pattern.design.practice.grocerystore;

import java.util.LinkedList;
import java.util.List;

public class GroceryStore {
  
  private Cashier cashier;
  private List<Item> itemList= new LinkedList<Item>();
  private Float storeMoney=1000f;
  
  
  
  
  
  
  public Float getStoreMoney() {
    return storeMoney;
  }



  public void setStoreMoney(Float storeMoney) {
    this.storeMoney = storeMoney;
  }



  public List<Item> getItemList() {
    return itemList;
  }



  public void setItemList(List<Item> itemList) {
    this.itemList = itemList;
  }



  public GroceryStore() {
   itemList.add(new Item("milk",18.4f));
   itemList.add(new Item("bread",8.4f));
   itemList.add(new Item("eggs Dozen",24.4f));
   itemList.add(new Item("pulse",123f));
   itemList.add(new Item("butter",109f));
   itemList.add(new Item("jam",201.4f));
   
  }



  public Cashier getCashier() {
    return cashier;
  }



  public void setCashier(Cashier cashier) {
    this.cashier = cashier;
    cashier.takePosition(this);
  }



  public static void main(String[] args) {
    GroceryStore store = new GroceryStore();
    Cashier cashier= new Cashier();
    store.setCashier(cashier);
    Customer customer= new Customer(store);
    customer.shop();
  }

}
