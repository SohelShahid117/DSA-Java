package algorithms;

public class LinearSearch {

    public static void main(String[] a) {

        int B[] = {60, 1, 88, 10, 11, 100};

        int n = B.length;
//        System.out.println(n);

//        System.out.println(B[4]);
//        int x = B[2];
        int x = 200;

        A myObj = new A();
//        myObj.linear_search(B, n, x);
        System.out.println("searching index is : "+myObj.linear_search(B, n, x));

    }
}
