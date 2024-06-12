public class DeleteMaxInMaxPQ {
  private Integer[] heap;
  private int n;

  public DeleteMaxInMaxPQ(int capacity) {
    heap = new Integer[capacity + 1];
    n = 0;
  }

  public int size() {
    return n;
  }

  public boolean isEmpty() {
    return n == 0;
  }

  private void swim(int k) { // Re-heapify
    while (k > 1 && heap[k / 2] < heap[k]) { // CHILD: heap[idx] PARENT: heap[idx/2]
      int temp = heap[k / 2];
      heap[k / 2] = heap[k];
      heap[k] = temp;
      k = k / 2; // for sifting up new value to it's correct position
    }
  }

  public void printMaxHeap() {
    for (int i = 1; i < heap.length; i++)
      System.out.print(heap[i] + " ");
    System.out.println();
  }
  // BOTTOM-UP (sifting-up)
  public void insert(int val) {
    if (n == heap.length - 1) {
      resize(heap.length * 2);
    }
    n++;
    heap[n] = val;
    swim(n);
  }


  private void resize(int newSize) {
    Integer[] tempArr = new Integer[newSize];
    for (int i = 1; i <=n; i++) {
      tempArr[i] = heap[i];
    }
    heap = tempArr;
  }

  private void swap(int v1, int v2) {
    int temp = heap[v1];
    heap[v1] = heap[v2];
    heap[v2] = temp;
}

private void reheapifyMaxPQ(int k) {   // k == parentIdx
    while (2 * k <= n) { // while left child exists
        int j = 2 * k; // left childIdx
        if (j < n && heap[j] < heap[j + 1]) { // if rightChild exists && leftChildValue < rightChildValue, move to rightIdx
            j++;
        }
        if (heap[k] > heap[j]) { // if parent > rightChild, break
            break;
        }
        swap(k, j);
        k = j; // parent = rightChild
    }
}

public int deleteMaxInMaxPQ() {
    if (n < 1) return -1; // Handle empty heap case

    int max = heap[1];
    swap(1, n);
    n--; // Exclude lastIndex from n
    reheapifyMaxPQ(1); // Passing index of top element (parentIdx) == k 
    heap[n + 1] = null;
    if (n > 0 && (heap.length / 4 == n)) resize(heap.length / 2);
    return max;
}

  public static void main(String[] args) {
    DeleteMaxInMaxPQ pq = new DeleteMaxInMaxPQ(3);

    pq.insert(2);
    pq.insert(4);
    pq.insert(6);
    pq.insert(2);
    System.out.println(pq.size());
    pq.printMaxHeap();
    System.out.println(pq.deleteMaxInMaxPQ());
    System.out.println(pq.deleteMaxInMaxPQ());
    pq.printMaxHeap();
  }

}
