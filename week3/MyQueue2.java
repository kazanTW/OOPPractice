class MyQueue2 extends MyStack2 {
	int front, rear, load;
    MyStack2 stack;

	public MyQueue2() {
		this(5);
	}

	public MyQueue2(int capacity) {
		super(capacity);
        this.front = 0;
        this.rear = 0;
		this.load = 0;
	}

	public boolean isEmptyQ() {
		if (this.load == 0) {
			System.out.println("EMPTY.");
			return true;
		} else return false;
	}

	public boolean isFullQ() {
		if (this.load == super.maxCapacity) {
			System.out.println("FULL.");
			return true;
		} else return false;
	}

	public void addQ(int item) {
		if (!isFullQ()) {
            super.stack[rear++] = item;
			this.load++;
            if (this.rear >= super.maxCapacity) this.rear = 0;
        }
	}

	public int deleteQ() {
        int item = 0;
		if (!isEmptyQ()) {
            item = super.stack[front];
            this.load--;
            this.front = (this.front + 1) % super.maxCapacity;
        }
        return item;
	}

	public void deleteAll() {
		while (!isEmptyQ()) System.out.println(deleteQ());
		this.load = 0;
	}

	public int size() {
		return this.load;
	}
}
