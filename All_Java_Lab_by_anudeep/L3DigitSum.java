import java.util.Scanner;

public class L3DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        
        int firstDigit = number / 10000;  // Extract the first digit
        int secondLastDigit = (number/10)  % 10;  // Extract the last digit

        int sum = firstDigit + secondLastDigit;

        System.out.println("Number: " + number);
        System.out.println("First Digit: " + firstDigit);
        System.out.println("Second Last Digit: " + secondLastDigit);
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
