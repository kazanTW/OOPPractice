public class MyStack {
	private int maxCapacity;
	private int[] stack;
	private int top;
	
	public MyStack() {
		this(5);
	}
	
	public MyStack(int capacity) {
		this.stack = new int[capacity];
		this.maxCapacity = capacity;
		this.top = -1;
	}
	
	public boolean isFull() {
		if (this.top == this.maxCapacity - 1) {
			System.out.println("The Stack is FULL!!!");
			return true;
		} else return false;
	}
	
	public boolean isEmpty() {
		if (this.top >= 0) return false;
		System.out.println("The Stack is EMPTY!!!");
		return true;
	}
	
	public void push(int theElement) throws StackFullException {
		if (!isFull()) stack[++top] = theElement;
        else throw new StackFullException();
	}

    public void push(String theElement) throws StackFullException {
        if (!isFull()) stack[++top] = Integer.parseInt(theElement);
        else throw new StackFullException();
    }
	
	public void pop() throws StackEmptyException {
		if (!isEmpty()) top--;
        else throw new StackEmptyException();
	}
	
	public int top() throws StackEmptyException {
		if (!isEmpty()) return stack[top];
        else throw new StackEmptyException();
	}
	
	public void popall() throws StackEmptyException {
		if (isEmpty()) throw new StackEmptyException();
        else {
            while (!isEmpty()) {
			    System.out.println(top());
			    pop();
            }
        } 
	}
	
	public static void main(String args[]) {	
		MyStack stack = new MyStack();
		
		stack.push(1);
 		stack.push(2);
		stack.push(3);
		System.out.println(stack.top());
		stack.pop();
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.pop();
		stack.popall();
		stack.pop();
	    // Final Output should be like:
		// 3
		// The Stack is FULL!!!
		// The Stack is FULL!!!
	    // 5
		// 4
		// 2
		// 1
	    // The Stack is EMPTY!!!
		// The Stack is EMPTY!!!
	}
}

class StackFullException extends Exception {

}

class StackEmptyException extends Exception {
       
}
