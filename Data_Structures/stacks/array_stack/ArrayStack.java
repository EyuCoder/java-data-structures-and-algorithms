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
}