package main.hackerrank;

import java.util.List;

public class BreakingTheRecords {

    public static void main(String[] args) {
        System.out.println(breakingRecords(List.of (3, 4, 21, 36, 10, 28, 35, 5, 24, 42)));
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int min = scores.get(0);
        int max = scores.get(0);
        int minCount = 0;
        int maxCount = 0;
        for (Integer currentScore : scores) {
            if (currentScore < min) {
                minCount++;
                min = currentScore;
            } else if (currentScore > max) {
                maxCount++;
                max = currentScore;
            }
        }
        return List.of(maxCount, minCount);
    }
}
