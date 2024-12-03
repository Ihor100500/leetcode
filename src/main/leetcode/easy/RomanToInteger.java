package main.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

  public static void main(String[] args) {
    RomanToInteger romanToInteger = new RomanToInteger();
    String s = "MCMXCIV";
    System.out.println(romanToInteger.romanToInt(s));
  }

  public int romanToInt(String s) {
    Map<Character, Integer> symbolIntegerMap =
        Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000);
    int sum = symbolIntegerMap.get(s.charAt(0));
    int dif = 0;
    for (int i = 1; i < s.length(); i++) {
      if (symbolIntegerMap.get(s.charAt(i)) > symbolIntegerMap.get(s.charAt(i-1))){
        dif += symbolIntegerMap.get(s.charAt(i-1));
      }
      sum += symbolIntegerMap.get(s.charAt(i));
    }
    if (dif != 0){
      sum = sum - (dif * 2);
    }
    return sum;
  }
}
