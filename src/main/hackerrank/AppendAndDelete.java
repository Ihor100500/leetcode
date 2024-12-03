package main.hackerrank;

public class AppendAndDelete {

    public static void main(String[] args) {
        System.out.println(appendAndDelete("aaaaaaaaaa", "aaaaa", 7)); //expected yes
    }

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        int maxLength = s.length() + t.length();
        if (maxLength <= k) {
            return "Yes";
        }
        int common = 0;

        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                break;
            }
            common++;
        }
        int sDiff = s.length() - common;
        int tDiff = t.length() - common;

        int totalDiff = sDiff + tDiff;

        if (totalDiff > k) {
            return "No";
        } else if ((k - totalDiff) % 2 == 0) {
            return "Yes";
        }
        return "No";
    }
}
