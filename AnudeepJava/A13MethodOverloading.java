class A
{
    void add(){
        int a=10,b=20,c;
        c=a+b;
        System.out.println(c);
    }
    void add(int x,int y){
        int c;
        c=x+y;
        System.out.println(c);
    }
    void add(int s,double t){
        double c;
        c=s+t;
        System.out.println(c);
    }
}


public class A13MethodOverloading {
    public static void main(String[] args) {
        A abc = new A();
        abc.add();
        abc.add(100,200);
        abc.add(50,45.56);
    }
}

// Compilation time Plymorphism ----> A polymorphism whic is exist at the time of compilation--> isme compiler ko pehle se 
// pata hota haiki kiss method ko call krna hai.

// method Overloading ---> whenevr a class contain more then one method with same name but diffrent parametre is calles method overloading
