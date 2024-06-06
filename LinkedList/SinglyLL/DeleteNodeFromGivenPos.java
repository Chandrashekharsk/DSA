public class DeleteNodeFromGivenPos {
  
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


  public void deleteNodeFromGivenPos(int position){
    if(position == 1){
      head = head.next;
      return;
    }
    ListNode prev = head;
    int count = 1;
    while (count<position-1){
      prev = prev.next;
      count++;
    }
    ListNode curr = prev.next;
    prev.next = curr.next;
    return;
  }

  public static void main(String[] args) {
    DeleteNodeFromGivenPos a = new DeleteNodeFromGivenPos();
    a.insertAtlast(1);
    a.insertAtlast(3);
    a.insertAtlast(5);
    a.insertAtlast(7);
    a.insertAtlast(9);
    a.display();
    a.deleteNodeFromGivenPos(5);
    a.display();
  }
}
