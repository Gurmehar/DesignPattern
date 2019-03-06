package pattern.design.iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class TestIterator {
  
  public static void main(String[] args) {
    Menu menu = new Menu(new LinkedList<Item>());
    menu.addItem(new Item("Dal", 220));
    menu.addItem(new Item("fish", 432.15f));
    menu.addItem(new Item("Chicken",522.89f));
    
    Iterator<Item> itr =menu.createIterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
    itr.remove();
    
    itr =menu.createIterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
  }

}
