public class ResizeArr{

  public int[] resize(int[] arr, int newSize){
    int[] temp = new int[newSize];
    
    for(int i=0; i<arr.length; i++){
      temp[i] = arr[i];
    }
    return temp;
  }

  public static void main(String[] args) {
    ResizeArr a = new ResizeArr();

    int[] arr = {5,9,3,10};
    int[] newArr = a.resize(arr, arr.length*2);
    for(int i : newArr){
      System.out.print(i+" ");
    }
    System.out.println();
  }
}