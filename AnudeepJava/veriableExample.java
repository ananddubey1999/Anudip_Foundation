public class veriableExample {
        // Instance variable
         int instanceVariable;
    
        // Static variable
         static int staticVariable;
    
        public void methodWithLocalVariable() {
            // Local variable
            int localVar = 10;
    
            // Using local variable
            System.out.println("Local Variable: " + localVar);
        }
    
        public void methodWithInstanceVariable() {
            // Using instance variable
            instanceVariable = 20;
            System.out.println("Instance Variable: " + instanceVariable);
        }
    
        public static void methodWithStaticVariable() {
            // Using static variable
            staticVariable = 30;
            System.out.println("Static Variable: " + staticVariable);
        }
    
        public static void main(String[] args) {
            veriableExample example = new veriableExample();
    
            example.methodWithLocalVariable();
            example.methodWithInstanceVariable();
            veriableExample.methodWithStaticVariable();
        }
    }
    
