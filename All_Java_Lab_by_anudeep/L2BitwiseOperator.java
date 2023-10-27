public class L2BitwiseOperator {
 public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary

        int bitwiseAnd = a & b; // Bitwise AND
        System.out.println("Bitwise AND: " + bitwiseAnd);


        int bitwiseOr = a | b;  // Bitwise OR
        System.out.println("Bitwise OR: " + bitwiseOr);


        int bitwiseXor = a ^ b; // Bitwise XOR
         System.out.println("Bitwise XOR: " + bitwiseXor);


        int bitwiseComplementA = ~a; // Bitwise complement of a
         System.out.println("Bitwise complement of a: " + bitwiseComplementA);


        int leftShift = a << 2; // Left shift a by 2 bits
         System.out.println("Left shift a by 2 bits: " + leftShift);


        int rightShift = a >> 2; // Right shift a by 2 bits
         System.out.println("Right shift a by 2 bits: " + rightShift);
         
    }
}