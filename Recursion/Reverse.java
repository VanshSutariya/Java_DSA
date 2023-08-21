package Recursion;

// TC: O(n)
public class Reverse {
    public static void printRev(String str, int indx) {
        if (indx == 0) {
            System.out.print(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        printRev(str, indx - 1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        printRev(str, str.length() - 1);
    }
}
