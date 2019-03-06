package pattern.design.practice.library;

import java.util.Map;

public class LibraryService {
  private Map<String,LibraryItem> items;

  public LibraryService(Map<String,LibraryItem> items) {
    super();
    this.items = items;
  }
  
  public boolean checkOut(String id, String holder) {
    if(items.containsKey(id)){
      return items.get(id).checkOut(holder);
      
    }
    return false;
    
  }
  
  public String getHolder(String id){
    if(this.items.containsKey(id)){
      return this.items.get(id).getHolder();
    }
    
    return "NA";
  }
  
  

}
