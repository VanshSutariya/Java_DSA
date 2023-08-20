package Recursion;

public class Factorial {
    public static int fact(int n) {
        if (n < 2) {
            return 1;
        } else {
            int ans = n * fact(n - 1);
            return ans;
        }

    }

    public static void main(String[] args) {
        int y = fact(5);
        System.out.println(y);
    }
}
