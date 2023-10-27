import java.util.Scanner;
public class parcelCharges {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the weight of the parcel in grams: ");
            int weight = scanner.nextInt();
    
            double initialCharge = 15.00;
            double additionalWeightCharge = 8.00;
    
            // Convert weight from grams to kilograms
            double weightInKg = weight / 1000.0;
    
            double totalCharge;
    
            if (weightInKg <= 1.0) {
                totalCharge = initialCharge;
            } else {
                double additionalWeight = Math.ceil(weightInKg - 1.0);
                totalCharge = initialCharge + (additionalWeight * additionalWeightCharge);
            }
    
            System.out.println("Charge = " + totalCharge);
    
            scanner.close();
        }
    }
    