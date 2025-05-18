package stack;
import java.util.Stack;

public class StackLearn {

    public static void main(String[] args) {
        // Create a type-safe stack for integers
        Stack<Integer> s = new Stack<>();

        // Push elements onto the stack
        s.push(1888);
        s.push(2);
        s.push(3);
        s.push(1114);

        // Pop elements from the stack
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
