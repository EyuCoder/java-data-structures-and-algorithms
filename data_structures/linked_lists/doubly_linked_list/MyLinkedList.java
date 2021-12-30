package data_structures.linked_lists.doubly_linked_list;

/**
 * insert node at head: O(1) constant time
 * insert node at tail: O(1) constant time
 * remove node from head: O(1) constant time
 * remove node from tail: O(1) Linear time
 * remove node from middle: O(n) Linear time
 * search: O(n) Linear time
 **/
public class MyLinkedList{

	public static void main(String[] args) {
		StudentDoublyLinkedList linkedList = new StudentDoublyLinkedList();
		System.out.println(linkedList.isEmpty());

		linkedList.printList();
		linkedList.prepend(99, "Joel");
		linkedList.prepend(88, "jhon");
		linkedList.prepend(77, "betty");
		linkedList.prepend(55, "sally");

		System.out.println(linkedList.getSize());
		linkedList.printList();

		linkedList.append(55, "janet");
		System.out.println(linkedList.getSize());
		linkedList.printList();

		linkedList.removeFromHead();
		System.out.println(linkedList.getSize());
		linkedList.printList();
		linkedList.removeFromTail();
		System.out.println(linkedList.getSize());
		linkedList.printList();
	}
}