// Q.3 Write a program to print the area of a rectangle by creating a class named 
// 'Area' taking the values of its length and breadth as parameters of its constructor and having 
// a method named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle 
// are entered through keyboard.
import java.util.Scanner;

class Area {
    public double length;
    public double breadth;

    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double returnArea() {
        return length * breadth;
    }
}

public class L4Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.println("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        Area rectangle = new Area(length, breadth);
        double area = rectangle.returnArea();

        System.out.println("The area of the rectangle is: " + area);
        sc.close();
    }
}
