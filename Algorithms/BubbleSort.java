public class BubbleSort {

  private void swap(int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  public void bubbleSort(int[] arr) {
    if (arr.length < 2)
      return;

    boolean isSwapped;
    for (int i = 0; i < arr.length - 1; i++) {
      System.out.println("i: " + i);
      isSwapped = false;

      for (int j = 0; j < arr.length - 1 - i; j++) {
        System.out.println(" j: " + j);
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
          isSwapped = true;
        }
      }

      if (!isSwapped)
        break;
    }
  }

  public static void main(String[] args) {
    BubbleSort obj = new BubbleSort();
    // obj.bubbleSort(new int[] {5, 1, 9, 2, 10});
    
    int[] arr = {5, 1, 9, 2, 10};
    obj.bubbleSort(arr);

    System.out.println("Sorted Array:");
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
