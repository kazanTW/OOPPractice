class MyStack2 {
	protected int maxCapacity;
	protected int[] stack;
	protected int top;
	
	public static int value = 100;
	
	public MyStack2() {
		this(5);
	}
	
	public MyStack2(int capacity) {
		this.maxCapacity = capacity;
		this.stack = new int[maxCapacity];
		this.top = -1;
	}
	
	public boolean isFull() {
		if(this.top == this.maxCapacity - 1) return true;
		return false;
	}
	
	public boolean isEmpty() {
		if(this.top >= 0) return false;
		return true;
	}
	
	public void push(int theElement) {
		if(!isFull()) {
			stack[++top] = theElement;
		}
	}
	
	public int pop() {
		if(!isEmpty()) return stack[top--];
		return 0;
	}
	
	public int top() {
		if(!isEmpty()) return stack[top];
		return 0;
	}
	
	public void popall() {
		while(!isEmpty()) {
			System.out.println(top());
			pop();
		}
	}
}
