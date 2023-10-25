package main;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        char[] originalArray = String.valueOf(x).toCharArray();
        int i = 0;
        for (int j = originalArray.length - 1; j >= originalArray.length / 2; j--) {
            if (originalArray[i] != originalArray[j]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
