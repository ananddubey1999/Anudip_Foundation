public class A19garbege{
    public void finalize(){
        System.out.println("garbege collected object");

}
    public void A(){   
        System.out.println("True");     

}
    public static void main(String args[]){
    A19garbege s1=new A19garbege();
    A19garbege s2=new A19garbege();
    // s1=null;
    s2=null;
    s1.A();
    System.gc();
    
    }
    }