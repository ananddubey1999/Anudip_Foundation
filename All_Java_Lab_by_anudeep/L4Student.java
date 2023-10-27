//  Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
//  Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student

public class L4Student {
    public String name;
    public int roll_no;
    
    public L4Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }
    
    public static void main(String[] args) {
        // Object Creation
        L4Student student = new L4Student("John", 2);
        
        
        // Accessing the attributes of the student object
        System.out.println("Name:-- " + student.name);
        System.out.println("Roll No:-- " + student.roll_no);
    }
}
