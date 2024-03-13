package main.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class AppleAndOrange {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        AppleAndOrange.countApplesAndOrangesAlt(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }


    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        List<Integer> appleDistances = new ArrayList<>();
        List<Integer> orangeDistances = new ArrayList<>();
        for (Integer appleDistance : apples) {
            appleDistances.add(a + appleDistance);
        }
        for (Integer orangeDistance : oranges) {
            orangeDistances.add(b + orangeDistance);
        }
        long applesInRange = appleDistances.stream()
                .filter(i -> i > s && i < t)
                .count();
        System.out.println(applesInRange);
        long orangeInRange = orangeDistances.stream()
                .filter(o -> o > s && o < t)
                .count();
        System.out.println(orangeInRange);
    }

    public static void countApplesAndOrangesAlt(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int applesInRange = 0;
        int orangesInRange = 0;
        for (Integer appleDistance : apples) {
            if ((a + appleDistance) >= s && (a + appleDistance) <= t) {
                applesInRange++;
            }
        }
        System.out.println(applesInRange);

        for (Integer orangeDistance : oranges) {
            if ((b + orangeDistance) >= s && (b + orangeDistance) <= t) {
                orangesInRange++;
            }
        }
        System.out.println(orangesInRange);
    }
}
