public class L5ReverseString {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        
        while (start < end) {
            char temp = s[start];    // Swaping the Array String
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] charArray = str.toCharArray();
        
        reverseString(charArray); // here it return it in the form of Array
        
        String reversedString = new String(charArray);  // here it convert Array to String by the use of String object
        System.out.println(reversedString);
    }
}

// 
