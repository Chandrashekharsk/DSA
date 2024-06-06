public class ReverseTheLL {
  private static class ListNode{
    int data;
    ListNode next;
    public ListNode(int data){
      this.data = data;
      this.next = null;
    }
  }

  private ListNode head;

  public void insertAtlast(int value){
    ListNode newNode = new ListNode(value);
    if(head == null){
      head = newNode;
      return;
    }

    ListNode curr = head;
    while (curr.next != null) {
      curr = curr.next;
    }
    curr.next = newNode;
  }
  public void display(){
    ListNode current = head;
    while(current != null){
      System.out.print(current.data+"--->");
      current = current.next;
    }
    System.out.print("null");
    System.out.println();
  }

  public void reverseLL(){
    if(head == null || head.next == null){
      return;
    }
    
    ListNode curr = head;
    ListNode prev = null;
    ListNode next = null;

    while(curr != null){
      next = curr.next;
      curr.next = prev; // Break the link
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public static void main(String[] args) {
    ReverseTheLL a = new ReverseTheLL();
    a.insertAtlast(1);
    a.insertAtlast(3);
    a.insertAtlast(5);
    a.insertAtlast(7);
    a.insertAtlast(9);
    a.display();
    a.reverseLL();
    a.display();
  }
}
