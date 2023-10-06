class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder newword = new StringBuilder();
       int i =0;
       while( i< word1.length() || i< word2.length()){
          if( i<word1.length() ){
              newword.append(word1.charAt(i));
          }
           if( i<word2.length() ){
              newword.append(word2.charAt(i));
          }
          i++;
       }

       return newword.toString();
    }
}