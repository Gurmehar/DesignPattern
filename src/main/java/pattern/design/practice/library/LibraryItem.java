package pattern.design.practice.library;

public interface LibraryItem {
  
   String getID();
   boolean checkOut(String holder);
   String getHolder();

}
