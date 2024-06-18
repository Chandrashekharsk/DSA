public class InsertionSort {

  public void insertionSort(int[] arr){
    for(int i=1; i<arr.length; i++){
      int temp = arr[i];
      int j = i-1;

      while(j>=0 && arr[j]> temp){
        arr[j+1] = arr[j];
        j-=1;
      }
      arr[j+1] = temp;
    }
  }

  public static void main(String[] args) {
    InsertionSort a = new InsertionSort();
    int[] arr = {4,2,9, 5,7,1};

    a.insertionSort(arr);
    for(int i : arr) {
      System.err.print(i+" ");
    }

  }
}
