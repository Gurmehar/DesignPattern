package pattern.design.practice.grocerystore;

public class Item implements GroceryItem {
  
  private String itemName;
  private float itemPrice;
  
  public Item(String itemName, float itemPrice) {
    super();
    this.itemName = itemName;
    this.itemPrice = itemPrice;
  }
  public String getItemName() {
    return itemName;
  }
  public void setItemName(String itemName) {
    this.itemName = itemName;
  }
  public float getItemPrice() {
    return itemPrice;
  }
  public void setItemPrice(float itemPrice) {
    this.itemPrice = itemPrice;
  }
  
  @Override
  public String toString() {
    return "Item [itemName=" + itemName + ", itemPrice=" + itemPrice + "]";
  }
  
  
  

}
