package String;

class Solution {
    public static boolean compare(String haystack, String needle, int idx) {
        int s1 = haystack.length();
        int s2 = needle.length();
        for (int i = 0; i < s2; i++) {
            if (idx >= s1)
                return false;
            if (haystack.charAt(idx++) != needle.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public int strStr(String haystack, String needle) {
        int s1 = haystack.length();

        for (int i = 0; i < s1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (compare(haystack, needle, i) == true)
                    return i;

            }
        }
        return -1;
    }
}
