
public class StackMethodsApp {
    private int[] arr;
    private int top;
    private int capacity;

    // Initialize an empty stack with a given capacity
    public StackMethodsApp(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1; // Initialize top index as -1 (empty stack)
    }

    // Push an element onto the stack
    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow: Cannot push item " + item + ". Stack is full.");
            return;
        }

        arr[++top] = item;
        System.out.println("Pushed item: " + item);
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop item. Stack is empty.");
            return -1;
        }

        int item = arr[top--];
        System.out.println("Popped item: " + item);
        return item;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Get the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

        return arr[top];
    }

    // Get the size of the stack
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        StackMethodsApp stack = new StackMethodsApp(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
