package Recursion;

public class CallGuest {
    public static int noOfWays(int n) {
        if (n <= 1) {
            return 1;
        }
        // single
        int ways1 = noOfWays(n - 1);
        // pairs
        int ways2 = (n - 1) * noOfWays(n - 2);
        return ways1 + ways2;
    }

    public static void main(String[] args) {
        int n = 4;
        int totalWays = noOfWays(n);
        System.out.println(totalWays);
    }
}
