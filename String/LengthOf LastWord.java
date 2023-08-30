package String;

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        int n = words.length;
        String str = words[n - 1];
        return str.length();
    }
}