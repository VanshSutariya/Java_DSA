
//Towner of Hanoi 
// time complexity = O(2^n);
package Recursion;

public class TOH {
    public static void toh(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        toh(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from  " + src + " to " + dest);
        toh(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        toh(n, "source", "helper", "Destination");
    }
}
