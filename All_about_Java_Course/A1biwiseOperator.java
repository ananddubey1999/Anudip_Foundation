public class A1biwiseOperator {
        public static void main(String[] args) {
            int a = 5; // 0101 in binary
            int b = 3; // 0011 in binary
    
            // Bitwise AND
            int bitwiseAnd = a & b;
            System.out.println("Bitwise AND: " + bitwiseAnd);
    
            // Bitwise OR
            int bitwiseOr = a | b;
            System.out.println("Bitwise OR: " + bitwiseOr);
    
            // Bitwise XOR
            int bitwiseXor = a ^ b;
            System.out.println("Bitwise XOR: " + bitwiseXor);
    
            // Bitwise complement
            int bitwiseComplementA = ~a;
            System.out.println("Bitwise complement of a: " + bitwiseComplementA);
    
            int bitwiseComplementB = ~b;
            System.out.println("Bitwise complement of b: " + bitwiseComplementB);
    
            // Bitwise left shift
            int leftShift = a << 2; // Shifts the bits of 'a' two positions to the left
            System.out.println("Left shift of a: " + leftShift);
    
            // Bitwise right shift
            int rightShift = a >> 1; // Shifts the bits of 'a' one position to the right
            System.out.println("Right shift of a: " + rightShift);
        }
    }
    