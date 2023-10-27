public class L1PalindromeNumber {
 public static void main(String[] args) {
        int lowerLimit = 1;
        int upperLimit = 1000;

        System.out.println("Palindrome numbers between " + lowerLimit + " and " + upperLimit + " are:");
        for (int number = lowerLimit; number <= upperLimit; number++) {
            if (isPalindrome(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber == originalNumber;
    }
}