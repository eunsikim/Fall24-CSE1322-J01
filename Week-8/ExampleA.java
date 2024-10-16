public class ExampleA {
    // Factorial using recursion
    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    // Palindrome using recursion
    public static boolean isPalindrome(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        } else if (word1.isEmpty() && word2.isEmpty()) {
            return true;
        } else if (word1.charAt(0) != word2.charAt(word2.length() - 1)) {
            return false;
        }

        return isPalindrome(word1.substring(1), word2.substring(0, word2.length() - 1));

    }

    // Repeater function using recursion
    public static int multiplyBy2(int x) {
        if (x == 0) {
            return 0;
        }

        return 2 + repeat(x - 1);
    }

    public static void main(String[] args) {

    }
}