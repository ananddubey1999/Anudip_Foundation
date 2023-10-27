import java.util.Scanner;
public class shopkeeper {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the price of an article: ");
            double price = scanner.nextDouble();
    
            double discountPercentage1 = 30.0;
            double discountPercentage2_1 = 20.0;
            double discountPercentage2_2 = 10.0;
    
            // Calculation for the first scheme (single discount)
            double discountedPrice1 = price - (price * (discountPercentage1 / 100));
    
            // Calculation for the second scheme (two successive discounts)
            double discountedPrice2_1 = price - (price * (discountPercentage2_1 / 100));
            double discountedPrice2 = discountedPrice2_1 - (discountedPrice2_1 * (discountPercentage2_2 / 100));
    
            if (discountedPrice1 < discountedPrice2) {
                System.out.println("First scheme of single discount is better.");
            } else if (discountedPrice2 < discountedPrice1) {
                System.out.println("Second scheme of two successive discounts is better.");
            } else {
                System.out.println("Both schemes offer the same price.");
            }
    
            scanner.close();
        }
    }
    
