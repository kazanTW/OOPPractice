import java.util.ArrayList;
import java.util.List;

class Queue<Type> {
    private List<Type> queue;
    private int capacity;
    private int front, rear;
    private int load;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.queue = new ArrayList<Type>();
        this.front = 0;
        this.rear = 0;
        this.load = 0;
    }

    public boolean isFull() {
        if (this.load == this.capacity) {
            System.out.println("Queue is FULL now.");
            return true;
        } else return false;
    }

    public boolean isEmpty() {
        if (this.load == 0) {
            System.out.println("Queue is EMPTY now.");
            return true;
        } else return false;
    }

    public int size() {
        return (this.load);
    }

    public void add(Type item) {
        if (!isFull()) {
            queue.add(item);
            this.rear++;
            this.load++;
            if (this.rear >= this.capacity) this.rear = 0;
        }
    }

    public Type delete() throws QueueEmpty {
        Type item;
        if (!isEmpty()) {
            item = queue.get(front);
            this.load--;
            this.front = (this.front + 1) % this.capacity;
            return item;
        } else throw new QueueEmpty();
    }

    public static void main(String[] args) {
        try {
            Queue<Integer> queue1 = new Queue<Integer>(5);
            System.out.println("Queue1:\n----------------");
            for (int i = 0; i < 5; i++) {
                System.out.println("Now add: " + i);
                queue1.add(i);
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("Now delete: " + queue1.delete());
            }
            
            System.out.print("\n");

            String[] arr = {"A", "B", "C", "D", "E"};
            Queue<String> queue2 = new Queue<String>(5);
            System.out.println("Queue2:\n----------------");
            for (int i = 0; i < 5; i++) {
                System.out.println("Now add:" + arr[i]);
                queue2.add(arr[i]);
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("Now delete: " + queue2.delete());
            }
        } catch (QueueEmpty e) {
            System.out.println(e.getMessage());
        }
    }
}

class QueueEmpty extends Exception {
    public QueueEmpty() {
        super("Queue is EMPTY now.");
    }
}
