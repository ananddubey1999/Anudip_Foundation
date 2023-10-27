import java.util.Scanner;
public class L3SwapingbyTwoveriable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before swapping:"+a+" "+b);
      

        // Swapping the values without using a third variable
        
        //  a=10 b=20
        a = a + b;    // a=30
        b = a - b;    // 30-20=10  b= 10
        a = a - b;    // 30-10 = 20   a= 20

        System.out.println("After swapping:"+a+" "+b);
        sc.close();;
    }
}
