import java.util.Scanner;

public class L3NumberReverseProgram {
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int number=sc.nextInt();

        int reversedNumber = 0;
        int remainder;
       // 123   ----> 321
        while (number != 0) {
            remainder = number % 10;   // 123 % 10 = 3
             reversedNumber = reversedNumber * 10 + remainder;   // 0 * 10 + 3 = 3   /// ---321
            number = number/10;     // 123 /10 = 12

        }
        System.out.println("Reversed Number: " + reversedNumber);
        sc.close();
    }
}
