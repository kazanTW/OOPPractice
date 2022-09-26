public class MyStack2 {
	private int maxCapacity;
	private int[] stack;
	private int top;
	
	public MyStack2() {
		this(5);
	}
	
	public MyStack2(int capacity) {
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
	
	public void push(int theElement) {
		if (!isFull()) {
			stack[++top] = theElement;
		}
	}
	
	public void pop() {
		if (!isEmpty()) top--;
	}
	
	public int top() {
		if (!isEmpty()) return stack[top];
		return 0;
	}
	
	public void popall() {
		while (!isEmpty()) {
			System.out.println(top());
			pop();
		}
	}
	
	public static void main(String args[]) {	
		MyStack2 stack = new MyStack2();
		
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
