//  Q.2  Assign and print the roll number, phone number and address of two students having names 
//  "Sam" and "John" respectively by creating two objects of class 'Student'.

public class L4Student2 {
     String name;
     int rollNo;
     String phoneNumber;
     String address;
    
    public L4Student2(String name, int rollNo, String phoneNumber, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
    public static void main(String[] args) {
        // Creating two objects of the L4Student2 class
        L4Student2 sam = new L4Student2("Sam", 1, "7379772846", "123 medical road");
        L4Student2 john = new L4Student2("John", 2, "7379772846", "456 Gorakhpur");
        
        // Printing the details of Sam
        System.out.println("Name:-- " + sam.name);
        System.out.println("Roll No:-- " + sam.rollNo);
        System.out.println("Phone Number:-- " + sam.phoneNumber);
        System.out.println("Address:-- " + sam.address);

         // Printing the details of John
        System.out.println();
        System.out.println("Name:-- " + john.name);
        System.out.println("Roll No:-- " + john.rollNo);
        System.out.println("Phone Number:-- " + john.phoneNumber);
        System.out.println("Address:-- " + john.address);
    }
}
