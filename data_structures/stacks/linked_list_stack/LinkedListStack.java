package data_structures.stacks.linked_list_stack;

import java.util.EmptyStackException;

public class LinkedListStack{
	private Node head;
	private int size;

	public LinkedListStack(){
		head = null;
		size = 0;
	}

	public void push(String value){
		Node newNode = new Node(value);
		if (size != 0) {
			newNode.next = head;
		}
		head = newNode;
		size++;
	}

	public String pop(){
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		Node removedNode = head;
		if (size > 0 ) {
			head = head.next;
			size--;
		}
		return removedNode.value;
	}

	public String peek(){
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		return head.value;
	}

	public boolean isEmpty(){
		return size == 0;
	}

	public void printStack() {
		System.out.println("____");
		Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("____");
	}
}