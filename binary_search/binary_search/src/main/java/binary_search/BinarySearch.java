package binary_search;

import java.util.Arrays;

public class BinarySearch {

    static int binary_search(int[] A, int target) {

//    static String binary_search(int[] A) {
//        return 5;
//        return A.length;
//        return A[3];
//        return Arrays.toString(A); // Convert array to readable string
//        return target;
        int n = A.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (A[mid] == target) {
                return mid;
            } else if (A[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] a) {
        System.out.println("Hello");
//        System.out.println(binary_search(588));

        int[] A = {5, 6, 7, 8, 9};
//        int target = 55;
        int target = 9;
        int result = binary_search(A, target);
        if (result != -1) {

            System.out.println("Target index is " + result);
        } else {
            System.out.println("Target element not found");
        }

    }

}
