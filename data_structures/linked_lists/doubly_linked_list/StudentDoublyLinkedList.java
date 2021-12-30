package data_structures.linked_lists.doubly_linked_list;

public class StudentDoublyLinkedList{

	private StudentNode head;
	private StudentNode tail;
	private int size;

	public void prepend(int grade, String name){
		StudentNode node = new StudentNode(grade, name);

		if (head == null) {
			tail = node;
		} else {
			head.setPrev(node);
			node.setNext(head);
		}

		head = node;
		size++;
	}

	public void append(int grade, String name){
		StudentNode node = new StudentNode(grade, name);

		if (tail == null) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrev(tail);
		}

		tail = node;
		size++;
	}

	public StudentNode removeFromHead(){
		if (isEmpty()) {
			return null;
		}

		StudentNode removedNode = head;

		if (head.getNext() == null) {
            tail = null;
        }
        else {
            head.getNext().setPrev(null);
        }

		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}

	public StudentNode removeFromTail() {
		if (isEmpty()) {
			return null;
		}

		StudentNode removedNode = head;

		if (tail.getPrev() == null) {
			head = null;
		} else {
			tail.getPrev().setNext(null);
		}

		tail = tail.getNext();
		size--;
		removedNode.setPrev(null);
		return removedNode;
	}

	public int getSize(){
		return size;
	}

	public Boolean isEmpty(){
		return head == null;
	}

	public void printList(){
		StudentNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.toString());
            System.out.print(" <-> ");
            current = current.getNext();
        }
        System.out.println("null");
	}
}