package Recursion;

// calcluate x^n using Stack Height = log n 
public class CalP {
    public static int CalPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return CalPower(x, n / 2) * CalPower(x, n / 2);
        } else {
            return CalPower(x, n / 2) * CalPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int ans = CalPower(2, 6);
        System.out.println(ans);
    }
}
