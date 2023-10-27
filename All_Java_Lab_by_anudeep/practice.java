// class student
// {
//     String name;
//     int roll;

//     public void a(String name , int roll){
//         System.out.println(name+" "+roll);
//     }
// }


// public class practice {
//     public static void main(String[] args) {
//         student abc= new student();
//         abc.a("raam" , 2);
//     }
// }

// class Student{
//     String name,adress,number;
   
//    public Student(String name,String adress, String number){
//           this.name=name;
//           this.adress=adress;
//           this.number= number;
//     }
// }


// public class practice {
//     public static void main(String[] args) {
//         Student sam = new Student("sam" , "gkp" , "123");
//         Student ram = new Student("ram" , "gkp" , "123");

//         System.out.println(sam.name);
//         System.out.println(sam.adress);
//         System.out.println(sam.number);

//         System.out.println(ram.name);
//         System.out.println(ram.adress);
//         System.out.println(ram.number);
//     }
// }

// class Area
// {
//     int length,bregth;

//     public Area(int length , int bregth){
//         this.length=length;
//         this.bregth=bregth;
//     }

//     public int printArea(){
//        return length*bregth;
//     }
// }

// public class practice {
// public static void main(String[] args) {
     
//     Area abc = new Area(20, 10);

//    int a= abc.printArea();
//    System.out.println(a);
//    }

// }
class Average
{
    double n1,n2,n3;

    public Average(double n1 , double n2,double n3){
        this.n1=n1;
        this.n2=n2;
        this.n3=n3;
    }

    public double printAverage(){
       return (n1+n2+n3)/3;
    }
}

public class practice {
public static void main(String[] args) {
     
    Average abc = new Average(20, 10, 30);

   double a= abc.printAverage();
   System.out.println(a);
   }

}
