package Recursion;

// if your array is in increaing manner then return true , else return false
//TC: O(n)
public class Sorted {
    public static boolean isSorted(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] >= arr[idx + 1]) {
            return false;
        }
        return isSorted(arr, idx + 1);

    }

    public static void main(String[] args) {
        int[] arr = { 10, 29, 30, 45, 67 };
        System.out.println(isSorted(arr, 0));
    }

}
