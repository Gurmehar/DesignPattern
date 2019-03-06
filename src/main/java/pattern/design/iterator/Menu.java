package pattern.design.iterator;

import java.util.Iterator;
import java.util.List;

public class Menu {
  
  private List<Item> menuItems;

  public Menu(List<Item> menuItems) {
    super();
    this.menuItems = menuItems;
  }
  
  
  public void addItem(Item item){
    menuItems.add(item);
  }
  
  public MenuIterator createIterator(){
    return new MenuIterator();
  }

  class MenuIterator implements Iterator<Item>{
    int currentIndex=0;
    @Override
    public boolean hasNext() {
      // TODO Auto-generated method stub
      return currentIndex<menuItems.size();
    }

    @Override
    public Item next() {
      // TODO Auto-generated method stub
      return menuItems.get(currentIndex++);
    }
    @Override
    public void remove() {
      // TODO Auto-generated method stub
      menuItems.remove(--currentIndex);
    }
    
    public Item first() {
      return menuItems.get(0);
    }
    
   public Item currentItem(){
       
     return menuItems.get(currentIndex);
   }
    
  }
  
}
