import java.util.Scanner;

public class L8LargestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        sc.close();

        String[] words = str.split(" ");
        String longestWord = "";
        int maxLength = 0;

        for (String word : words) {
            int length = word.length();
            if (length > maxLength) {
                maxLength = length;
                longestWord = word;
            }
        }

        System.out.println("The longest word: " + longestWord);
        System.out.println("The length of the word: " + maxLength);
    }
}
