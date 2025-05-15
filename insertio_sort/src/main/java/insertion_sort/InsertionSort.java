package insertion_sort;

public class InsertionSort {
    
    public static void main(String[] a) {
        
        System.out.println("hello");
        
        int[] A = {1, 2, 3, 5};
        int target = 4;
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] < target && A[i + 1] > target) {
                int temp = A[i + 1];
                A[i + 1] = target;
                // A[i + 2] = temp;
            }
        }
        
        for (int i : A) {
            System.out.print(i);
        }
    }
    
}
