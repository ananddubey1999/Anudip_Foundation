public class intVar {

    int area(){
        int length=20;
        int breadth=10;
        int rectarea=length*breadth;
        return rectarea;
    }
    public static void main(String[] args) {
        intVar abc= new intVar();
      int x= abc.area();
      System.out.println(x);
      System.out.println("Area is "+ abc.area());
    }
}
