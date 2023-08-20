package Recursion;

// find x^n using recursion ( Stack height = n)
public class CalPower {
    public static int ClPow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xpownm1 = ClPow(x, n - 1);
        int xpow = x * xpownm1;
        return xpow;
    }

    public static void main(String[] args) {
        int ans = ClPow(2, 5);
        System.out.println(ans);
    }
}
