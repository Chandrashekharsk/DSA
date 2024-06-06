public class SearchKey {
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


  public boolean searchKey(int key){
    ListNode curr = head;
    while(curr != null){
      if(curr.data == key){
        return true;
      }
      curr = curr.next;
    }
    return false;
  }


  public static void main(String[] args) {
    SearchKey a = new SearchKey();
    a.insertAtlast(1);
    a.insertAtlast(3);
    a.insertAtlast(5);
    a.insertAtlast(7);
    a.insertAtlast(9);
    a.display();
    System.out.println(a.searchKey(9));
    System.out.println(a.searchKey(2));
  }
}
