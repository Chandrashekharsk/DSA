public class FindMisNum2 {

  public int findMisNum(int[] arr){

    // range of numbers is known 
    int n = arr.length+1;
    // formula of sumOfN_NaturalNumbers n*(n+1)/2
    int sum = n*(n+1)/2;

    for(int i=0; i<arr.length; i++){
      sum -= arr[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    FindMisNum2 a = new FindMisNum2();
    System.out.println(a.findMisNum(new int[] {2,4,1,8,6,3,7}));
  }
}
