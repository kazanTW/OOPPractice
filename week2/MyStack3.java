public class MyStack3 {
	private int maxCapacity;
	private int[] stack;
	private int top;
	
	public MyStack3() {
		this(5);
	}
	
	public MyStack3(int capacity) {
		this.stack = new int[capacity];
		this.maxCapacity = capacity;
		this.top = -1;
	}
	
	public boolean isFull() {
		if (this.top == this.maxCapacity - 1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if (this.top >= 0) return false;
		System.out.println("The Stack is EMPTY!!!");
		return true;
	}
	
	public void push(int theElement) {
		if (!isFull()) {
			this.stack[++top] = theElement;
		} else {
			int stack1[] = new int[maxCapacity * 2];
			for (int i = 0; i < maxCapacity; i++) {
				stack1[i] = stack[i];
			}
			this.stack = stack1;
			this.maxCapacity *= 2;
			this.stack[++top] = theElement;
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
		MyStack3 stack = new MyStack3();
		
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
		stack.push(9);
		stack.push(10);
		stack.push(11);
		stack.push(12);
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
