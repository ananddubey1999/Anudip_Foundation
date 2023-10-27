
    
class Employee {
    private String name;
    private int yearOfJoining;
    private String address;

    public Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println(name + "\t" + yearOfJoining + "\t\t" + address);
    }
}

public class L4Employee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 1994, "64C- WhiteField");
        Employee employee2 = new Employee("Sam", 2000, "68D- SHR  Layout");
        Employee employee3 = new Employee("John", 1999, "26B- Marathalli");

        System.out.println("Name\t\tYear of Joining\t-Address");
        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
    }
}

// Q.5 Write a program that would print the information (name, year of joining, salary, address) of three employees
//  by creating a class named 'Employee'. The output should be as follows:
// Name        Year of joining        Address
// Robert            1994                64C- WallsStreat
// Sam                2000                68D- WallsStreat
// John                1999                26B- WallsStreat