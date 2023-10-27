public class A0InstantVar {
    int x=5,y=9,z;
    void add(){
        z=x+y;
        System.out.print(z);
    }
    void sub(){
        z=x-y;
        System.out.print(z);
    }

public static void main(String args[]){
    A0InstantVar ins = new A0InstantVar();
    ins.add();
}
}
//  instatnt var is iniatialise in the class and use it outside of the class 
// javac instatntVar.java
//  java instatntVar