/**
 * 
 **/
public class Main{

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