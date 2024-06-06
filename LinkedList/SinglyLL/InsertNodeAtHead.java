
public class InsertNodeAtHead {
  private static class ListNode{
    int data;
    ListNode next;
    public ListNode(int data){
      this.data = data;
      this.next = null;
    }
  }

  private ListNode head;

  public void insertAtHead(int value){
    ListNode newNode = new ListNode(value);
    if(head == null){
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }
  public void display(){
    ListNode current = head;
    while(current != null){
      System.out.print(current.data+"--->");
      current = current.next;
    }
    System.out.print("null");
  }

  public static void main(String[] args) {
    InsertNodeAtHead a = new InsertNodeAtHead();
    a.insertAtHead(1);
    a.insertAtHead(3);
    a.insertAtHead(5);
    a.insertAtHead(7);
    a.insertAtHead(9);
    a.display();
  }
}