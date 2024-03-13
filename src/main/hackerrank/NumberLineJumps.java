package main.hackerrank;

public class NumberLineJumps {

    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3,4,2));
    }


    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        if(v2 > v1 && x2 > x1) {
            return "NO";
        }
        int i = 1;
        while (i < 10000){
            int sum1 = v1 * i +x1;
            int sum2 = v2 * i +x2;
            if(sum2 == sum1){
                return "YES";
            }
            i++;
        }
        return "NO";
    }
}
