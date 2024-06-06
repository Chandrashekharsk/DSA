public class ReverseArr {

  public void reverseArr(int[] arr, int str, int end) {
    while (str < end) {
      // SWAP
      int temp = arr[end];
      arr[end] = arr[str];
      arr[str] = temp;
      str++;
      end--;
    }
  }

  public void reverseArrRecc(int[] arr, int str, int end) {
    if (str >= end) {
      return;
    }
    // SWAP
    int temp = arr[end];
    arr[end] = arr[str];
    arr[str] = temp;
    str++;
    end--;
    reverseArr(arr, str++, end--);
  }

  public static void main(String[] args) {
    ReverseArr a = new ReverseArr();
    int[] arr = { 2, 11, 5, 10, 7, 8 };
    for (int i : arr)
      System.out.print(i + " ");
    System.out.println();
    // a.reverseArr(arr, 0, arr.length - 1);
    a.reverseArrRecc(arr, 0, arr.length - 1);
    for (int i : arr)
      System.out.print(i + " ");
    System.out.println();
  }
}
