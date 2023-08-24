
import java.util.*;

public class Array_Demo {
    public static void main(String[] args) {
        System.out.println("enter rno:");
        Scanner sc = new Scanner(System.in);
        // int[] rno = new int[7];
        // for (int i = 0; i < rno.length; i++) {
        // rno[i] = sc.nextInt();
        // }
        // System.out.println(Arrays.toString(rno));
        // rno[1] = 29;
        // System.out.println(Arrays.toString(rno));

        int[][] arr = new int[3][4];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

    }
}
