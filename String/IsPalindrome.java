public class IsPalindrome {

  public boolean isPalindrome(String word){
    char[] charArr = word.toCharArray();
    int start = 0;
    int end = word.length()-1;
    while(start<end){
      if(charArr[start] != charArr[end]) return false;
      start++; end--;
    }
    return true;
  }

  public static void main(String[] args) {
    // String str = "madam";
    String str = "mah am";
    IsPalindrome a = new IsPalindrome();
    System.out.println(a.isPalindrome(str));
  }
}