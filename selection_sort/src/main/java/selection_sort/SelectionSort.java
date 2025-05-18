package selection_sort;

import java.util.Arrays;


public class SelectionSort {

    static void selection_sort(int[] A) {
//    static String selection_sort(int[] A) {
        System.out.print("before sorting:");
        for (int i : A) {
//            System.out.println(i);
            System.out.print(i + " ");
        }
//        return Arrays.toString(A);

        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
//                if (A[j] < A[i]) {
                if (A[j] < A[min_index]) {
                    min_index = j;
                }
            }
            int temp = A[i];
            A[i] = A[min_index];
            A[min_index] = temp;

        }
        System.out.print("\nafter sorting:");

        for (int i : A) {
//            System.out.println(i);
            System.out.print(i + " ");
        }

    }

    public static void main(String[] a) {

        System.out.println("Hello world");

        int[] A = {4, 5, 7, 1, 8, 2,88,3,21};
        selection_sort(A);
//        System.out.println(selection_sort(A));

    }

}
