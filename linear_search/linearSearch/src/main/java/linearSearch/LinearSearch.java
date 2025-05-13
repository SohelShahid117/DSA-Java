package linearSearch;

public class LinearSearch {

    static int linear_search(int[] A, int target) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (A[i] == target) {
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        System.out.println("hi,how r u?");

        int[] A = {4, 5, 7, 8, 99, 1, 2, 3};
//        int target = 99;
        int target = 199;

        int result = linear_search(A, target);
        if (result != -1) {
            System.out.println("target index is :" + result);

        } else {
            System.out.println("target element is not found");
        }
    }
}
