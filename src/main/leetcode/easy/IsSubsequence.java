package main.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class IsSubsequence {

  public static void main(String[] args) {
    IsSubsequence isSubsequenceObj = new IsSubsequence();
    String s = "aab";
    String t = "baaxb";

    System.out.println(isSubsequenceObj.isSubsequence(s, t));
  }

  public boolean isSubsequence(String s, String t) {
    int sp = 0;
    int tp = 0;

    while (sp < s.length() && tp < t.length()) {
      if (s.charAt(sp) == t.charAt(tp)) {
        sp++;
      }
      tp++;
    }

    return sp == s.length();
  }
}
