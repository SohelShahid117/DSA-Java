package algorithms;

public class A {

    public int linear_search(int B[], int n, int x) {
//        System.out.println("hi");
//        System.out.println(B[2]);

        int i;
        for (i = 0; i < B.length; i++) {
//            System.out.println(B[i]);
            if (B[i] == x) {
                return i;
            } 
        }
        i=-1;
        return i;

    }
}
