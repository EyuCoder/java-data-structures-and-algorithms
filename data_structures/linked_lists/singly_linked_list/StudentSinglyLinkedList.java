package data_structures.linked_lists.singly_linked_list;

public class StudentSinglyLinkedList{

	private StudentNode head;
	private int size;

	public void prepend(int grade, String name){
		StudentNode node = new StudentNode(grade, name);
		node.setNext(head);
		head = node;
		size++;
	}

	public StudentNode removeFromHead(){
		if(isEmpty()){
			return null;
		}

		StudentNode removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null);
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
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
	}
}