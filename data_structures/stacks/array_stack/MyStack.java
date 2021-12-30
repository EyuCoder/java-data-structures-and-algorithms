package data_structures.stacks.array_stack;

/**
 * LIFO (last in first out)
 * time: O(1) => peek, push, pop (push could be O(n) if resize is needed)
 **/
public class MyStack{

	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(5);

		stack.push("stack");
		stack.push("a");
		stack.push("is");
		stack.push("this");
		stack.push("hello");
		
		stack.printStack();

		System.out.println("pop: " + stack.pop());
		System.out.println("peek: " +stack.peek());

		stack.printStack();
	}
}