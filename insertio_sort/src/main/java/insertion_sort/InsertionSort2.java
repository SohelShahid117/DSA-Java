package insertion_sort;

public class InsertionSort2 {

    public static void insertion_sort(int[] A) {
        int n = A.length;
//        System.out.print(n);

        for (int i = 1; i < n; i++) {
            int temp = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > temp) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = temp;

        }

    }

    public static void main(String[] arg) {
        int[] A = {43, 31, 26, 29, 12};
        System.out.print("Before Sorting:");
        for (int i : A) {
            System.out.print(i+" ");
        
        }

        insertion_sort(A);
        
        System.out.print("\nAfter Sorting:");
        for (int i : A) {
            System.out.print(i+" ");
        
        }

    }

}
