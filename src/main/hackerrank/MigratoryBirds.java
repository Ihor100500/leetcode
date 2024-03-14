package main.hackerrank;

import java.util.*;

public class MigratoryBirds {

    public static void main(String[] args) {
        System.out.println(migratoryBirds(List.of(1,2,3,4,5,4,3,2,1,3,4)));
    }


    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> typeAmountMap = new HashMap<>();

        for (Integer i : arr) {
            typeAmountMap.putIfAbsent(i, 0);
            typeAmountMap.computeIfPresent(i, (k, v) -> v + 1);
        }
        return typeAmountMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow()
                .getKey();
    }
}

