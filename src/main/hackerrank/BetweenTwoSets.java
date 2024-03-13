package main.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BetweenTwoSets {
    public static void main(String[] args) {
        System.out.println(getTotalX(List.of(3, 4), List.of(24, 48)));
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int count = 0;

        int max = a.stream().max(Integer::compareTo).orElseThrow();
        int min = b.stream().min(Integer::compareTo).orElseThrow();

        for (int number = max; number <= min; number++) {
            if (getResultFromFirstArr(number, a) && getResultFromSecondArr(number, b)) {
                count++;
            }
        }

        return count;
    }

    private static boolean getResultFromFirstArr(int number, List<Integer> a) {
        for (Integer firstInt : a) {
            if (number % firstInt != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean getResultFromSecondArr(int number, List<Integer> b) {
        for (Integer secondInt : b) {
            if (secondInt % number != 0) {
                return false;
            }
        }
        return true;
    }
}
