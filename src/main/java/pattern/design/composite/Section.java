package pattern.design.composite;

import java.util.ArrayList;
import java.util.List;

public class Section {

  private String title;
  private int pages;
  private List<Section> subSections;
  
  public Section(String title, int pages) {
    super();
    this.title = title;
    this.pages = pages;
    this.subSections= new ArrayList<Section>();
  }

  public String getTitle() {
    return title;
  }

  public int getPages() {
    return pages;
  }
  
  
  public void addSection(Section sec){
    this.subSections.add(sec);
  }
  
  public void remove(Section sec){
    this.subSections.remove(sec);
  }
  
  public int getAllPages(){
    Section s=null;
    int pageCount=this.pages;
    for (Section section : subSections) {
      pageCount=pageCount+section.getAllPages();
    }
    return pageCount;
  }
  
  
}
