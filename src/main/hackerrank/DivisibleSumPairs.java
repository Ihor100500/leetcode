package main.hackerrank;

import java.util.List;
import java.util.stream.Collectors;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6, 3, List.of(1, 3, 2, 6, 1, 2)));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int res = 0;
        int index = 1;
        for (Integer i : ar) {
            List<Integer> subList = ar.subList(index, n);
            for (Integer iFromSublist : subList) {
                if ((i + iFromSublist) % k == 0) {
                    res++;
                }
            }
            index++;
        }
        return res;
    }
}
