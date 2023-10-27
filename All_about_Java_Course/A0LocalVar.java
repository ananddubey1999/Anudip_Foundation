public class A0LocalVar {
    void main(){
        System.out.println("anand");
        int a=3,b=7,c;
        c=a+b;
        System.out.print(c);
    }
    void sub(){
        int a=3,b=7,c;
        c=a-b;
        System.out.print(c);
    }
public static void main(String args[]){
    A0LocalVar lc = new A0LocalVar();

    lc.main();
    lc.sub();
}
}
