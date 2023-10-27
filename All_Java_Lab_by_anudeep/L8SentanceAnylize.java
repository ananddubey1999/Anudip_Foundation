
import java.util.Scanner;

public class L8SentanceAnylize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        sc.close();

        int totalDigits = 0;
        int totalLowercaseLetters = 0;
        int totalUppercaseLetters = 0;
        int totalAlphabets = 0;
        int totalSpecialCharacters = 0;
        int totalVowels = 0;
        int totalWords = 0;

        char[] chars = sentence.toCharArray();
        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                totalDigits++;
            } else if (Character.isLetter(ch)) {
                totalAlphabets++;
                if (Character.isLowerCase(ch)) {
                    totalLowercaseLetters++;
                } else if (Character.isUpperCase(ch)) {
                    totalUppercaseLetters++;
                }

                if (isVowel(ch)) {
                    totalVowels++;
                }
            } else {
                totalSpecialCharacters++;
            }
        }

        String[] words = sentence.split(" ");
        totalWords = words.length;

        System.out.println("Total number of digits: " + totalDigits);
        System.out.println("Total number of lowercase letters: " + totalLowercaseLetters);
        System.out.println("Total number of uppercase letters: " + totalUppercaseLetters);
        System.out.println("Total number of alphabets: " + totalAlphabets);
        System.out.println("Total number of special characters: " + totalSpecialCharacters);
        System.out.println("Total number of vowels: " + totalVowels);
        System.out.println("Total number of words: " + totalWords);
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
