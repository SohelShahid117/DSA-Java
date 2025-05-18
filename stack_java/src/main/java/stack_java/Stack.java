package stack_java;

public class Stack {

    int stack[] = new int[5];
    int top = 0;

    public void push(int data) {
//        System.out.println(stack.length);
        if (top < stack.length) {
            stack[top] = data;
            top++;
        } else {
            System.out.println("Stack is overflow");
        }

    }

    public void show() {
        for (int n : stack) {
            System.out.print(n + " ");
        }
    }

    public int pop() {
        int data;
        top--;
        if (top >= 0) {
            data = stack[top];
            stack[top] = 0;

            return data;
        } else {
            return -1;
        }

    }

    public int peek() {
        int data;
        System.out.println("\ntop index is " + top);

        if (top >= 0) {
            data = stack[top - 1];

            return data;
        } else {
            return -1;
        }

    }

    public int size() {

        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

}
