import java.util.ArrayList;
import java.util.List;

class Stack<Type> {
    private List<Type> stack;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = new ArrayList<Type>();
        this.top = -1;
    }

    public Stack() {
        this(5);
    }

    public void push(Type element) {
        if (this.top != this.capacity - 1) {
            ++top;
            stack.add(element);
        }
    }

    public void pop() {
        if (this.top >= 0) {
            stack.remove(top);
            top--;
        }
    }

    public Type top() throws StackEmpty {
        if (this.top >= 0) return stack.get(top);
        else throw new StackEmpty();
    }

    public static void main(String[] args) {
        try {
            Stack<Integer> stack1 = new Stack<Integer>(5);

            for (int i = 0; i < 5; i++) {
                stack1.push(i);
                System.out.println("Stack1 top now is: " + stack1.top());
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("Now pop: " + stack1.top());
                stack1.pop();
            }
            System.out.println();
            Stack<String> stack2 = new Stack<String>(5);
            String[] arr = {"A", "B", "C", "D", "E"};
            for (int i = 0; i < 5; i++) {
                stack2.push(arr[i]);
                System.out.println("Stack2 top now is: " + stack2.top());
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("Now pop: " + stack2.top());
                stack2.pop();
            }
        } catch (StackEmpty e) {
            System.out.println(e.getMessage());
        }
    }
}

class StackEmpty extends Exception {
    public StackEmpty() {
        super("Stack is EMPTY now.");
    }
}
