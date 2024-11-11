package ese_pracs_a_sec;

class q2 {
    private int[] stack;
    private int top;
    private int capacity;

    public q2(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = x;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public static void main(String[] args) {
        q2 stack = new q2(5);
        stack.push(10);
        stack.push(20);
        System.out.println("Popped: " + stack.pop());
    }
}
