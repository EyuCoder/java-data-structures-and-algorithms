/**
 * LIFO (last in first out)
 * time: O(1) => peek, push, pop
 **/
public class Main{

	public static void main(String[] args) {
		LinkedListStack stack = new LinkedListStack();

		stack.push("stack");
		stack.push("a");
		stack.push("is");
		stack.push("this");
		stack.push("hello");
		
		stack.printStack();

		System.out.println("pop: " + stack.pop());
		System.out.println("peek: " + stack.peek());

		stack.printStack();
	}
}