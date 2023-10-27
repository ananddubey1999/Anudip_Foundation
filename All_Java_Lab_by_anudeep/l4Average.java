
// Q.4 Print the average of three numbers entered by user by creating a class named 'Average'
//  having a method to calculate and print the average.
import java.util.Scanner;

class Average {
    public void calculateAndPrintAverage() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double number1 = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double number2 = sc.nextDouble();

        System.out.println("Enter the third number: ");
        double number3 = sc.nextDouble();

        double average = (number1 + number2 + number3) / 3;

        System.out.println("The average is: " + average);
        sc.close();
    }
}

public class l4Average {
    public static void main(String[] args) {
        Average average = new Average();
        average.calculateAndPrintAverage();
    }
}
