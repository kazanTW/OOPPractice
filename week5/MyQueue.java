public class MyQueue {
	private int[] queue;
	private int capacity;
	private int front, rear;
	private int load;

	public MyQueue(int capacity) {
		this.capacity = capacity;
		this.queue = new int[capacity];
		this.front = 0;
		this.rear = 0;
		this.load = 0;
	}

	public boolean isFull() {
		if (this.load == this.capacity) {
			System.out.println("The Queue is FULL!");
			return true;
		} else return false;
	}
	
	public boolean isEmpty() {
		if (this.load == 0) {
			System.out.println("The Queue is EMPTY!");
			return true;
		} else return false;
	}
	
	public int size() {
		return (this.load);
	}

	public void addQ(int theItem) {
		if (!isFull()) {
			queue[rear++] = theItem;
			this.load++;
			if (this.rear >= this.capacity) this.rear = 0;
		}
	}

    public void addQ(String theItem) {
        if (!isFull()) {
            queue[rear++] = Integer.parseInt(theItem);
            this.load++;
            if (this.rear >= this.capacity) this.rear = 0;
        }
    }

	public int deleteQ() {
        int item = 0;
		if (!isEmpty()) {
            item = queue[front];
			this.load--;
            this.front = (this.front + 1) % this.capacity;
		}

		return item;
	}

	public void deleteAll() {
		while (!isEmpty()) System.out.println(deleteQ());
        this.load = 0;
	}
}
