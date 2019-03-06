package pattern.design.statergy;

public class MySorter extends Sorter {

  

  @Override
  public void sort(int arr[]) {
    getSortInterface().sort(arr);
  }

}
