import java.util.*;
public class A1logical {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the first boolean value (true or false): ");
        boolean value1 = scanner.nextBoolean();

        // System.out.print("Enter the second boolean value (true or false): ");tr
        boolean value2 = scanner.nextBoolean();

        // Perform logical AND, OR, and NOT operations
        boolean andResult = value1 && value2;
        boolean orResult = value1 || value2;
        boolean notResult = !value1;

        System.out.println("Logical AND result: " + andResult);
        System.out.println("Logical OR result: " + orResult);
        System.out.println("Logical NOT result for value1: " + notResult);

        scanner.close();
    }
}

