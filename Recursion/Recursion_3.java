package Recursion;

// print all permutations of a string
// "abc" o/p: abc,acb,bac,bca,cab,cba
// TC: O(n!)
public class Recursion_3 {
    public static void printpermutation(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printpermutation(newStr, permutation + currChar);

        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printpermutation(str, "");

    }
}
