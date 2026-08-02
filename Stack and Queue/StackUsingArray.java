public class StackUsingArray {
    int i = -1;
    int stack[];

    public StackUsingArray(int n) {
        stack = new int[n];
    }

    public boolean isEmpty() {
        if (i == -1)
            return true;
        return false;
    }

    public boolean isFull() {
        if (i == stack.length - 1)
            return true;
        return false;
    }

    public void push(int x) {
        if (i >= stack.length - 1)
            return;
        i++;
        stack[i] = x;
    }

    public void pop() {
        if (i != -1)
            i--;
    }

    public int peek() {
        if (isEmpty())
            return -1;
        return stack[i];
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
