public class RemoveEven {

  public int[] removeEven (int[] arr){
    int count = 0;
    for (int i=0; i<arr.length; i++){
      if(arr[i]%2 != 0){
        count++;
      }
    }

    int[] allodds = new int[count];
    int j=0;
    for(int i=0; i<arr.length; i++){
      if(arr[i]%2 != 0){
        allodds[j] = arr[i];
        j++;
      }
    }
    return allodds;
  }

  public static void main(String[] args) {
    RemoveEven a = new RemoveEven();
    int[] arr = a.removeEven(new int[] {3,2,4,7,10,6,5});
    for(int i: arr){
      System.out.println(i+ " ");
    }
  }
}
