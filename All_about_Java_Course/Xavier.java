import java.util.Scanner;
public class Xavier {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter marks obtained in English: ");
            int englishMarks = scanner.nextInt();
            System.out.print("Enter marks obtained in Maths: ");
            int mathsMarks = scanner.nextInt();
            System.out.print("Enter marks obtained in Science: ");
            int scienceMarks = scanner.nextInt();
    
            if (englishMarks >= 80 && mathsMarks >= 80 && scienceMarks >= 80) {
                System.out.println("Eligible for Pure Science");
            } else if (englishMarks >= 80 && scienceMarks >= 80 && mathsMarks >= 60) {
                System.out.println("Eligible for Bio Science");
            } else if (englishMarks >= 60 && mathsMarks >= 60 && scienceMarks >= 60) {
                System.out.println("Eligible for Commerce");
            } else {
                System.out.println("Not eligible for any stream");
            }
    
            scanner.close();
        }
    }
    