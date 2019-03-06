package pattern.design.iterator;

public class Item {

  private String itemName;
  private float itemPrice;
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
  
  
  public Item(){}
  
  public Item(String itemName, float itemPrice) {
    super();
    this.itemName = itemName;
    this.itemPrice = itemPrice;
  }
  @Override
  public String toString() {
    return "Item [itemName=" + itemName + ", itemPrice=" + itemPrice + "]";
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
    result = prime * result + Float.floatToIntBits(itemPrice);
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Item other = (Item) obj;
    if (itemName == null) {
      if (other.itemName != null)
        return false;
    } else if (!itemName.equals(other.itemName))
      return false;
    if (Float.floatToIntBits(itemPrice) != Float.floatToIntBits(other.itemPrice))
      return false;
    return true;
  }
  
  
  
  
}
