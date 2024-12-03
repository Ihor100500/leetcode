package main.leetcode.easy;

public class MergeAlternatively {

  public static void main(String[] args) {
    MergeAlternatively mergeAlternativelyObj = new MergeAlternatively();
    String word1 = "abcdq";
    String word2 = "p";
    System.out.println(mergeAlternativelyObj.mergeAlternately(word1, word2));
  }

  public String mergeAlternately(String word1, String word2) {
    String endOfString = "";
    int dif = word1.length() - word2.length();
    if (dif > 0) {
      endOfString = word1.substring(word2.length());
      return mergeStrings(word1, word2, word2.length()).concat(endOfString);
    } else if (dif < 0) {
      endOfString = word2.substring(word1.length());
      return mergeStrings(word1, word2, word1.length()).concat(endOfString);
    } else {
      return mergeStrings(word1, word2, word1.length());
    }
  }

  private String mergeStrings(String word1, String word2, int length) {
    StringBuilder stringBuilder = new StringBuilder();
    char[] charArrayWord1 = word1.toCharArray();
    char[] charArrayWord2 = word2.toCharArray();
    for (int i = 0; i < length; i++) {
      stringBuilder.append(charArrayWord1[i]).append(charArrayWord2[i]);
    }
    return stringBuilder.toString();
  }
}
