package Recursion;

// tileplacment
public class PlaceTiles {
    public static int tileplacement(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // place vertical
        int verticalplace = tileplacement(n - m, m);
        // place horizontal
        int horizontalplace = tileplacement(n - 1, m);
        return verticalplace + horizontalplace;

    }

    public static void main(String[] args) {
        int n = 4;
        int m = 2;
        int totalWays = tileplacement(n, m);
        System.out.println(totalWays);
        ;
    }
}
