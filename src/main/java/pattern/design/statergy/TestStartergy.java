package pattern.design.statergy;

public class TestStartergy {

  public static void main(String[] args) {
    int arr[] ={1,4,6,7,9,9,0,5,3};
    SortInterface sortInterface= new QuickSort();
    Sorter sorter= new MySorter();
    sorter.setSortInterface(sortInterface);
    sorter.sort(arr);
    sorter.setSortInterface(new MergeSort());
    sorter.sort(arr);
  }
  
}
