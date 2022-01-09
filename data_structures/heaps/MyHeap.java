package data_structures.heaps;

public class MyHeap {

    public static void main(String[] args) {
        Heap heap = new Heap(10);

        heap.insert(10);
        heap.insert(45);
        heap.insert(60);
        heap.insert(38);
        heap.insert(15);
        heap.insert(40);
        heap.insert(62);
        heap.insert(87);
        heap.printHeap();

        System.out.println(heap.peek());

        heap.delete(0);
        heap.printHeap();

        System.out.println(heap.peek());
    }
}
