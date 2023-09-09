import java.util.Arrays;
import java.util.Scanner;

public class NextGreaterNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        int output = findNextGreaterNumber(input);
        if (output == -1) {
            System.out.println("There is no greater number using the same digits.");
        } else {
            System.out.println("Input: " + input);
            System.out.println("Next Greater Number: " + output);
        }

        scanner.close();
    }

    public static int findNextGreaterNumber(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        int n = digits.length;

        // Check if the input number is a single-digit number
        if (n == 1) {
            return -1;
        }

        // Step 1: Find the first digit from the right that is smaller than the digit to
        // its right
        int i;
        for (i = n - 2; i >= 0; i--) {
            if (digits[i] < digits[i + 1]) {
                break;
            }
        }

        // If no such digit is found, return -1 (not possible to generate a greater
        // number)
        if (i == -1) {
            return -1;
        }

        // Step 2: Find the smallest digit to the right of it, which is greater than the
        // current digit
        int smallestGreaterIndex = i + 1;
        for (int j = i + 2; j < n; j++) {
            if (digits[j] > digits[i] && digits[j] < digits[smallestGreaterIndex]) {
                smallestGreaterIndex = j;
            }
        }

        // Step 3: Swap these two digits
        char temp = digits[i];
        digits[i] = digits[smallestGreaterIndex];
        digits[smallestGreaterIndex] = temp;

        // Step 4: Sort the digits to the right of the current position in ascending
        // order
        Arrays.sort(digits, i + 1, n);

        // Convert the modified array back to a number and return it
        return Integer.parseInt(new String(digits));
    }
}