package bubble_sort;

public class BubbleSort {

    public static void main(String[] a) {

        System.out.println("hello");
        int[] A = {10, 5, 2, 8, 7};
        int n = A.length;

        System.out.print("before sorting:");
        for (int i : A) {

            System.out.print(i + " ");
        }

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;

                }
            }

        }

        System.out.print("\nafter sorting:");
        for (int i : A) {

            System.out.print(i + " ");
        }

    }
}
