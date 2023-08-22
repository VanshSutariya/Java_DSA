package Recursion;

//TC: O(2^n);
import java.util.*;

public class NaturalNo_Subsets {
    public static void printSubset(ArrayList<Integer> subset) {
        for (int k : subset) {
            System.out.print(k);
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }
        // add hoga
        subset.add(n);
        findSubset(n - 1, subset);
        // add nahi hoga
        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}
