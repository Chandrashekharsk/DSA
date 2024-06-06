import java.util.Arrays;

// Range of numbers unknown
public class FindMisNum {

  // Making instance variable
  int expectedNext;

  public int missingNumber(int[] arr){
    expectedNext = -1;
    Arrays.sort(arr);

    for(int i=0; i<arr.length-2; i++){
      if(arr[i+1] != arr[i]+1){
        expectedNext = arr[i] + 1;
        break;
      }
    }
    return expectedNext;
  }

  public static void main(String[] args) {
    FindMisNum a = new FindMisNum();
    int missingVal = a.missingNumber(new int[] {2,4,1,8,6,3,7});
    System.out.println(missingVal);
  }
}
 