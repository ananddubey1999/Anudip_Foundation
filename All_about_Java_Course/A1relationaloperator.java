
import java.util.*;
public class A1relationaloperator {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter the first number: ");
            int number1 = sc.nextInt();
    
            System.out.print("Enter the second number: ");
            int number2 = sc.nextInt();
    
            // Perform relational operations
            boolean isEqual = number1 == number2;
            boolean isNotEqual = number1 != number2;
            boolean isGreater = number1 > number2;
            boolean isLess = number1 < number2;
            boolean isGreaterOrEqual = number1 >= number2;
            boolean isLessOrEqual = number1 <= number2;
    
            System.out.println("Equal: " + isEqual);
            System.out.println("Not Equal: " + isNotEqual);
            System.out.println("Greater: " + isGreater);
            System.out.println("Less: " + isLess);
            System.out.println("Greater or Equal: " + isGreaterOrEqual);
            System.out.println("Less or Equal: " + isLessOrEqual);
    
            sc.close();
        }
    }
    
