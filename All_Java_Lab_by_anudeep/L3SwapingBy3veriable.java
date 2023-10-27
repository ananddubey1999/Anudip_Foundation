import java.util.Scanner;

public class L3SwapingBy3veriable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before swapping:"+a+" "+b);

        // Swapping the values using a temporary variable
        
        int temp = a;     //a=10 b=20    temp = 10
        a = b;           //20
        b = temp;        //10
        System.out.println("After swapping:"+a+" "+b); // a= 20  b= 10
        sc.close();
    }
}
