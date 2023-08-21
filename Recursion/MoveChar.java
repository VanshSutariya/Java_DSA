package Recursion;

//TC: O(n)
// Remove all x and put it at the end of the string
public class MoveChar {
    public static void moveAllX(String str, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString = newString + 'x';
            }
            System.out.println(newString);
            return;
        }
        char currVal = str.charAt(idx);
        if (currVal == 'x') {
            count++;
            moveAllX(str, idx + 1, count, newString);
        } else {
            newString = newString + currVal;
            moveAllX(str, idx + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxdcfxd";
        moveAllX(str, 0, 0, "");
    }
}
