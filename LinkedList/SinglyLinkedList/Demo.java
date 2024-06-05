public class Demo {

  private static class ListNode{
    int data ;
    ListNode next;
    public ListNode(int data){
      this.data = data;
      this.next = null;
    }
  }
  
  private ListNode head;

  public void display(){
    ListNode current = head;
    while(current != null){
      System.out.print(current.data+"--->");
      current = current.next;
    }
    System.out.print("null");
  }

  public static void main(String[] args) {
    Demo sll = new Demo();
    sll.head = new ListNode(5);
    ListNode l1 = new ListNode(6);
    ListNode l2 = new ListNode(7);
    ListNode l3 = new ListNode(8);
    ListNode l4 = new ListNode(9);

    // Now we will connect them together to form a chain
    sll.head.next = l1;
    l1.next = l2;
    l2.next = l3;
    l3.next = l4;

    sll.display();
  }
}