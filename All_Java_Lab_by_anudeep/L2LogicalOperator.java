public class L2LogicalOperator {
    public static void main(String[] args) {
        boolean s = true;
        boolean t = false;

        boolean And = s && t; // Logical AND
        boolean OR = s || t;  // Logical OR
        boolean NotA = !s;    // Logical NOT

        System.out.println("Logical AND is : " + And);
        System.out.println("Logical OR is : " + OR);
        System.out.println("Logical NOT of s  is : " + NotA);
    }
}