package Recursion;

public class FindOccurance {
    static int first = -1;
    static int last = -1;

    public static void findOccurrence(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println("First index:" + first);
            System.out.println("Last index:" + last);
            return;
        }
        char currentchar = str.charAt(idx);
        if (currentchar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        findOccurrence(str, idx + 1, element);
    }

    public static void main(String[] args) {

        String str = "aabnhsngdsnioteyuanbhsadvg";
        System.out.println(str.length());
        findOccurrence(str, 0, 'a');
    }
}
