   
interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

class MyClass implements InterfaceA, InterfaceB {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() {
        System.out.println("Method B");
    }
}

public class A14MultipleInheritance {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.methodA(); // Output: Method A
        myObject.methodB(); // Output: Method B
    }
}
