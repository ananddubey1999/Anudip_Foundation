import java.util.Scanner;
public class if_elseif {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter a number: ");
            int marks = scanner.nextInt();
    
            // Example 1: if statement
              if(marks<=80 && marks>=100){
                System.out.println("Gread A");
              }
              else if(marks<=79 && marks>=60){
                System.out.println("Gread B");
              }
              else if(marks<=59 && marks>=40){
                System.out.println("Gread C");
              }
              else {
                System.out.println(" Pass");
              }

            scanner.close();
        }
    }
    