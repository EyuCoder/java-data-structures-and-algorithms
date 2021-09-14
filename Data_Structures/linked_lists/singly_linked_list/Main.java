/**
 * insert node at head: O(1) constant time
 * insert node at tail: O(n) constant time
 * remove node from head: O(1) constant time
 * remove node from tail: O(n) Linear time
 * remove node from middle: O(n) Linear time
 * search: O(n) Linear time
 **/
public class Main{

	public static void main(String[] args) {
		StudentSinglyLinkedList linkedList = new StudentSinglyLinkedList();
		System.out.println(linkedList.isEmpty());

		linkedList.printList();
		linkedList.prepend(99, "Joel");
		linkedList.prepend(88, "jhon");
		linkedList.prepend(77, "betty");
		linkedList.prepend(55, "sally");

		System.out.println(linkedList.getSize());

		linkedList.printList();
		linkedList.removeFromHead();
		System.out.println(linkedList.getSize());
		linkedList.printList();
	}
}