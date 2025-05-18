package stack_java;

public class Runner {

    public static void main(String[] a) {
        Stack s = new Stack();
        s.push(5);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(15);
        s.push(544);

        s.show();

        System.out.println("\npopped is:" + s.pop());
        System.out.println("\npopped is:" + s.pop());
        System.out.println("\npopped is:" + s.pop());
        System.out.println("\npopped is:" + s.pop());
        System.out.println("\npopped is:" + s.pop());
        System.out.println("\npopped is:" + s.pop());
//        System.out.println("\npopped is:" + s.pop());

        System.out.println("\nafter pop:");
        s.show();

        System.out.println("\nwhen peek:");
        System.out.println("\npeeked data is:" + s.peek());
        System.out.println("\nsize of stack is:" + s.size());

//        s.push(65);
//        s.push(75);

        s.show();

        System.out.println("\npeeked data is:" + s.peek());
        System.out.println("\nsize of stack is:" + s.size());
        System.out.println("\nstack is empty:" + s.isEmpty());
    }

}
