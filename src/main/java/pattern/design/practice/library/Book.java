package pattern.design.practice.library;

import java.util.Date;

public class Book {

  private String title,author,edition;
  private int pageCount;
  private Long isbn;
  private Date yearOfPublish;
  
  
  
  public Book(String title, String author, String edition, int pageCount, Long isbn,
      Date yearOfPublish) {
    super();
    this.title = title;
    this.author = author;
    this.edition = edition;
    this.pageCount = pageCount;
    this.isbn = isbn;
    this.yearOfPublish = yearOfPublish;
  }
  
  
  public String getTitle() {
    return title;
  }
  public String getAuthor() {
    return author;
  }
  public String getEdition() {
    return edition;
  }
  public int getPageCount() {
    return pageCount;
  }
  public Long getIsbn() {
    return isbn;
  }
  public Date getYearOfPublish() {
    return yearOfPublish;
  }
  
  
  
}
