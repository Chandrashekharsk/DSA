public class SelectionSort {

  public void selectionSort(int[] arr){
    for(int i=0; i<arr.length-1; i++){
      int minIdx = i;

      for(int j=i+1; j<arr.length; j++){
        if(arr[j]<arr[minIdx]){
          minIdx = j;
        }
      }
      
      int temp = arr[minIdx];
      arr[minIdx] = arr[i];
      arr[i] = temp;
    }
  }

    

  public static void main(String[] args) {
      SelectionSort s1 = new SelectionSort();
      int[] arr = {5, 2, 3, 7, 8, 9};
      s1.selectionSort(arr);
      for (int i : arr) {
          System.out.print(i + " ");
      }
  }
}
