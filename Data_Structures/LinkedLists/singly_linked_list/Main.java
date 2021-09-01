/**
 * create new node: O(1) constant time
 * remove node from head: O(1) constant time
 * remove node from tail: O(n) Linear time
 * remove node from middle: O(n) Linear time
 * search: O(n) Linear time
 **/
public class Main{

	public static void main(String[] args) {
		StudentLinkedList linkedList = new StudentLinkedList();
		System.out.println(linkedList.isEmpty());

		linkedList.printList();
		linkedList.append(99, "Joel");
		linkedList.append(88, "jhon");
		linkedList.append(77, "betty");
		linkedList.append(55, "sally");

		System.out.println(linkedList.getSize());

		linkedList.printList();
		linkedList.removeFromHead();
		System.out.println(linkedList.getSize());
		linkedList.printList();
	}
}