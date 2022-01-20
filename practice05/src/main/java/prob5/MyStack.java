package prob5;

public class MyStack {
	
	private String[] stack;
	private int temp = 0;
	
	public MyStack(int i) {
		stack = new String[i];
	}

	public void push(String string) {
		if(temp <= stack.length-1)
			stack[temp++] = string;
	}

	public boolean isEmpty() {
		if(temp == 0 ) {
			return true;
		}
		return false;
	}

	public String pop() throws MyStackException{
		if(isEmpty()) {
			throw new MyStackException("stack is empty !");
		}
		return stack[--temp];
		
	}
}