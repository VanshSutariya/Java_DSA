import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(MathChallenge(num));
    }

    public static String MathChallenge(int num) {
        String numStr = String.valueOf(num);
        List<Integer> arr = new ArrayList<>();
        char[] s = numStr.toCharArray();
        for (char c : s) {
            arr.add(Character.getNumericValue(c));
        }

        if (arr.size() < 2) {
            return "not possible";
        }

        return matchChallen(arr.subList(1, arr.size()), arr.get(0));
    }

    public static String matchChallen(List<Integer> arr, int sum) {
        if (arr.size() == 1) {
            if (sum + arr.get(0) == 0) {
                return "+";
            } else if (sum - arr.get(0) == 0) {
                return "-";
            } else {
                return "not possible";
            }
        }

        String s2 = matchChallen(arr.subList(1, arr.size()), sum - arr.get(0));
        if (!s2.equals("not possible")) {
            return "-" + s2;
        }

        String s1 = matchChallen(arr.subList(1, arr.size()), sum + arr.get(0));
        if (!s1.equals("not possible")) {
            return "+" + s1;
        }
        return "not possible";
    }

}
