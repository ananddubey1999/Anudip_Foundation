    
import java.util.Scanner;

public class L8RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or string: ");
        String input = sc.nextLine();
        sc.close();

        StringBuilder str = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (!isVowel(ch)) {
                str.append(ch);
            }
        }

        String result = str.toString();
        System.out.println("New string after removing vowels: " + result);
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
