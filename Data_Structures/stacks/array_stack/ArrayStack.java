import java.util.EmptyStackException;

public class ArrayStack{
	private String[] stack;
	private int top;

	public ArrayStack(int size){
		stack = new String[size];
	}

	public void push(String value){
		stack[top++] = value;
	}

	public String pop(){
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		String poppedStr = stack[--top];
        stack[top] = null;
        return poppedStr;
	}

	public String peek(){
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top - 1];
	}

	public int size(){
		return top;
	}

	public boolean isEmpty(){
		return top == 0;
	}

	public void printStack() {
		System.out.println("____");
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
        System.out.println("____");
    }
}