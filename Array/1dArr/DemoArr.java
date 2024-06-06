public class DemoArr{

  public void printArray(int[] arr){
    int n = arr.length;
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    DemoArr a = new DemoArr();
    a.printArray(new int[] {1,2,3,4,5}); // declare and initialize anonymous arr
  }
}