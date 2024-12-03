package main.hackerrank;

import java.math.BigInteger;

public class ExtraLongFactorials {

    public static void main(String[] args) {
        extraLongFactorials(25);
    }

    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger res = BigInteger.valueOf(1);
        while (n != 1) {
            res = res.multiply(BigInteger.valueOf(n));
            n--;
        }
        System.out.println(res);
    }
}
