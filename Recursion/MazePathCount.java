package Recursion;

// Count Total Paths of Maze
// it is also doing backtracking 
public class MazePathCount {
    public static int countPaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 || j == m - 1) {
            return 1;
        }
        // move downpath
        int downpath = countPaths(i + 1, j, n, m);

        // move rightside
        int rightpath = countPaths(i, j + 1, n, m);

        return downpath + rightpath;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int totalpaths = countPaths(0, 0, n, m);
        System.out.println(totalpaths);
    }
}
