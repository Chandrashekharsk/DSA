public class InsertAtMaxPQ {
  private int[] heap;
  private int n;
  public InsertAtMaxPQ(int capacity){
    heap = new int[capacity+1];
    n=0;
  }

  public int size(){
    return n;
  }
  public boolean isEmpty(){
    return n==0;
  }
  private void resize(int newSize){
    int[] tempArr = new int[newSize];
    for (int i=0; i<heap.length; i++){
      tempArr[i] = heap[i];
    }
    heap = tempArr;
  }
  private void swim(int k){  //Re-heapify
    while(k>1 && heap[k/2] < heap[k]){   // CHILD: heap[idx]   PARENT: heap[idx/2]
      int temp = heap[k/2];
      heap[k/2] = heap[k];
      heap [k] = temp;
      k = k/2;  // for sifting up new value to it's correct position
    }
  }

  public void printMaxHeap(){
    for(int i=1; i<heap.length; i++)System.out.print(heap[i]+" ");
    System.out.println();
  }
   
  // BOTTOM-UP (sifting-up)
  public void insert(int val){
    if(n==heap.length-1){
      resize(heap.length*2);
    }
    n++;
    heap[n] = val;
    swim(n);
  }

  public static void main(String[] args) {
    InsertAtMaxPQ pq = new InsertAtMaxPQ(3);

    pq.insert(2);
    pq.insert(4);
    pq.insert(6);
    pq.insert(2);
    System.out.println( pq.size());
    pq.printMaxHeap();
  }
}
