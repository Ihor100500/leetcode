package main.hackerrank;


import java.util.ArrayList;
import java.util.List;

public class CompareStrings {
    public static void main(String[] args) {
        System.out.println(compareStrings("#h", "#hss##"));
    }

    public static int compareStrings(String s1, String s2) {
        if (transformStr(s1).equals(transformStr(s2))) {
            return 1;
        } else {
            return 0;
        }
    }

    public static String transformStr(String s1) {
        while (s1.contains("#")) {
            if (s1.length() == 1) {
                return "";
            } else if (s1.indexOf("#") == 0) {
                s1 = s1.substring(1);
            } else {
                String substring = s1.substring(0, s1.indexOf("#") - 1);
                s1 = substring.concat(s1.substring(s1.indexOf("#") + 1));
            }
        }
        return s1;
    }
}