public class DeleteFirst {
  public static class ListNode{
    int data;
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
    System.out.println();
  }


  public ListNode deleteFirst(){
    if(head == null){
      return null;
    }
    ListNode temp = head; 
    temp.next = null;
    head = head.next;
    return temp;
  }

  public ListNode deleteLast(){
    if(head == null || head.next == null){
      return head;
    }

    ListNode curr = head;
    ListNode prev = null;
    while(curr.next != null){
      prev = curr;
      curr = curr.next;
    }
    prev.next = null;
    return curr;
  }

  public static void main(String[] args) {
    DeleteFirst sll = new DeleteFirst();
    sll.head = new ListNode(1);
    ListNode l1 = new ListNode(2);
    ListNode l2 = new ListNode(3);
    ListNode l3 = new ListNode(4);
    ListNode l4 = new ListNode(6);

    // Now we will connect them together to form a chain
    sll.head.next = l1;
    l1.next = l2;
    l2.next = l3;
    l3.next = l4;

    sll.display();
    // sll.deleteFirst(); // 1
    // sll.deleteFirst(); // 2
    // sll.deleteFirst(); // 3
    // sll.deleteFirst(); // 4
    // System.out.println(sll.deleteFirst()); // 6

    sll.deleteLast(); // 1
    sll.deleteLast(); // 2
    sll.deleteLast(); // 3
    sll.deleteLast(); // 4
    sll.deleteLast(); // 4
    System.out.println(sll.deleteLast()); // 6
    sll.display();
  }
}
