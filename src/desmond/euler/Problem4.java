package desmond.euler;

public class Problem4 {

    public static void main(String[] args) {
        int largest = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int product = i * j;
                if (product > largest && isPalindromic(product)) {
                    largest = product;
                }
            }
        }
        System.out.println(largest);
    }

    public static boolean isPalindromic(int number) {
        String str = "" + number;
        for (int i = 0; i <= str.length() - i; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
