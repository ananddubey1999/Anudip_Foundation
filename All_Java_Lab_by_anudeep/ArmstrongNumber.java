/**
 * ArmstrongNumber
 */
public class ArmstrongNumber {

 public static void main(String[] args) {
        int lowerLimit = 1;
        int upperLimit = 1000;

        System.out.println("Armstrong numbers between " + lowerLimit + " and " + upperLimit + " are:");
        for (int number = lowerLimit; number <= upperLimit; number++) {
            if (isArmstrong(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digit;

        while (number > 0) {
            digit = number % 10;
            sum += Math.pow(digit, 3); // Change the power value according to the number of digits
            number /= 10;
        }

        return sum == originalNumber;
    }
}