package pattern.design.statergy;

public abstract class Sorter {

  private SortInterface sortInterface;

  
  
  public SortInterface getSortInterface() {
    return sortInterface;
  }



  public void setSortInterface(SortInterface sortInterface) {
    this.sortInterface = sortInterface;
  }



  public abstract void sort(int arr[]);
  
  
}
