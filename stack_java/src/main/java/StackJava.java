
import java.util.Stack;
//package stack_java;

public class StackJava {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        System.out.println("hello");

        s.push("Apple");
        s.push("Banana");
        s.push("Cherry");

        System.out.println("Top of stack: " + s.peek());
        System.out.println("Popped item: " + s.pop());
        System.out.println("Popped item: " + s.pop());
        System.out.println("Is stack empty? " + s.isEmpty());

    }
}
