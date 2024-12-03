package main.hackerrank;

public class SherlockAndSquares {

    public static void main(String[] args) {
        System.out.println(squares(465868129 , 988379794));
    }

    public static int squares(int a, int b) {
        // Write your code here
        int count = 0;
        for (int i = a; i <= b; i++) {
            int left = 0;
            int right = i;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                long res = (long) mid * mid;
                if (res == i) {
                    count++;
                    break;
                } else if (res > i) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return count;
    }
}
