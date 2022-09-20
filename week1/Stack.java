public class Stack {
	//
	final static int MAX_STACK_SIZE = 5;
	static int[] stack = new int[MAX_STACK_SIZE];
	static int top = -1;
	
	public static boolean isFull() {
		if (top == MAX_STACK_SIZE - 1) {
			System.out.println("The Stack is FULL!!!");	
			return true;
		}
		return false;
	}
	
	public static boolean isEmpty() {
		if (top >= 0) {
			return false;
		}
		System.out.println("The Stack is EMPTY!!!");
		return true;
	}
	
	public static void push(int theElement) {
		if(!isFull()) {
			stack[++top] = theElement;
		}
	}
	
	public static void pop() {
		if (!isEmpty()) {
			top--;
		}
	}
	
	public static int top() {
		if (!isEmpty()) {
			return stack[top];
		}
		return -999;
	}
	
	public static void popall() {
		// print the top and then pop it until the stack is empty
		while (!isEmpty()) {
			System.out.println(top());
			pop();
		}
	}
	
	public static void main(String args[]) {
		
		// the following codes are used for test
		// please do not modify the following codes
		
		push(1);
		push(2);
		push(3);
		System.out.println(top());
		pop();
		push(4);
		push(5);
		push(6);
		push(7);
		push(8);
		pop();
		popall();
		pop();
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
