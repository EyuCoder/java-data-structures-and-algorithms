package data_structures.arrays;

public class ReverseLinkedList{
	static Node head;

	static class Node{
		int value;
		Node next;

		Node(int value){
			this.value = value;
			next = null;
		}
	}

	static Node reverse(Node head){
        Node prev = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

	static void printList(Node node){
		System.out.print("HEAD -> ");
		while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("NULL");
	}

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(23);
        list.head.next = new Node(435);
        list.head.next.next = new Node(76);
        list.head.next.next.next = new Node(-99);
        list.head.next.next.next.next = new Node(12);
        printList(list.head);
        list.head = list.reverse(head);
        printList(list.head);
	}
}