class MyStack4 extends MyStack2 {
	
	public MyStack4(int capacity) {
		super(capacity);
	}
	
	public boolean isFull() {
		if(top == maxCapacity - 1) {
            int tempStack[] = new int [maxCapacity * 2];
            for (int i = 0; i < maxCapacity; i++) {
                tempStack[i] = super.stack[i];
            }
            stack = tempStack;
            maxCapacity *= 2;
            return false;
        }
		return false;
	}
	
	public int size() {
		return top + 1;
	}

    public static void main(String[] args) {
        MyStack4 stack = new MyStack4(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Now top is: " + stack.top());
        stack.pop();
        stack.push(4);
        stack.push(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Now top is: " + stack.top());
        System.out.println("Now size is: " + stack.size());
        stack.push(50);
        stack.push(100);
        stack.push(1000);
        stack.push(10000);
        System.out.println("Now top is: " + stack.top());
        System.out.println("Now size is: " + stack.size());
        stack.popall();
    }
}
