public class L5StringIntegerConversion {
    
    public static void main(String[] args) {
        String str = "789";
        
        //Converting String to Integer 
        int strToNumber = Integer.parseInt(str);
        System.out.println("String to Integer Conversion: " + strToNumber);
        
        //Converting Integer to String 
        String NumbertoStr = String.valueOf(strToNumber);
        System.out.println("Integer to String Conversion: " + NumbertoStr);
    }
}