package Recursion;

import java.util.*;

public class Fibonnaci {
    static int count = 0;

    public static void fib(int a, int b, int n) {
        if (n == 0) {
            System.out.println("count:" + count);
            return;
        }
        count++;
        int c = a + b;
        System.out.print(c + " ");
        fib(b, c, n - 1);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        fib(a, b, n - 2);
    }
}
