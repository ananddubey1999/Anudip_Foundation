public class L5VowelConsonantCounter {
    public static void CountVandC(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
    
    public static void main(String[] args) {
        String str = "Hello, World!";
        CountVandC(str);
    }
}
