public class InsertNodeAtGivenPos {
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

  public void insertNodeAtGivenPos(int value, int position){
    ListNode newNode = new ListNode(value);
    if(head == null) System.out.println("List is empty");

    if(position ==1){
      newNode.next = head;
      head = newNode;
    }

    ListNode prev = head;
    int count = 1;
    while (count < position-1) {
      prev = prev.next;
      count++;
    }
    
    ListNode temp = prev.next;
    prev.next = newNode;
    newNode.next = temp;
  }

  public static void main(String[] args) {
    InsertNodeAtGivenPos sll = new InsertNodeAtGivenPos();
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
    sll.insertNodeAtGivenPos(5,5);
    sll.display();
  }
}
