public class ExceptionDemo {
    public static void main(String[] args) {
        // Divide by zero
        try {
            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println("Result: " + result); // This line will not be reached
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }

        // Null pointer exception
        try {
            String str = null;
            int length = str.length(); // This line will throw NullPointerException
            System.out.println("Length: " + length); // This line will not be reached
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        }

        // Array index out of bounds exception
        try {
            int[] numbers = { 1, 2, 3 };
            int index = 5; // This index is out of bounds for the array
            int value = numbers[index]; // This line will throw ArrayIndexOutOfBoundsException
            System.out.println("Value: " + value); // This line will not be reached
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception: " + e.getMessage());
        }
    }
}

