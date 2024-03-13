package main.hackerrank;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SubarrayDivision {

    public static void main(String[] args) {
        System.out.println(birthday(List.of(1, 2, 1, 3, 2), 3, 2));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int fromIndex = 0;
        int count = 0;
        while (fromIndex + m <= s.size()) {
            int sum = s.subList(fromIndex, fromIndex + m).stream().mapToInt(Integer::intValue).sum();
            if (sum == d) {
                count++;
            }
            fromIndex++;
        }
        return count;
    }
}
