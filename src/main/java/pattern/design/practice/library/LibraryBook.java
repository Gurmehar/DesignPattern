package pattern.design.practice.library;

import java.util.Date;

public class LibraryBook extends Book implements LibraryItem {

  
  private String Id;
  private String holder;
  
  

  public LibraryBook(String title, String author, String edition, int pageCount, Long isbn,
      Date yearOfPublish, String id, String holder) {
    super(title, author, edition, pageCount, isbn, yearOfPublish);
    Id = id;
    this.holder = holder;
  }

  @Override
  public String getID() {
    // TODO Auto-generated method stub
    return this.Id;
  }

  @Override
  public boolean checkOut(String holder) {
    if(this.holder==null){
      this.holder=holder;
      return true;  
    }
    return false;
  }

  @Override
  public String getHolder() {
    // TODO Auto-generated method stub
    return this.holder;
  }

}
