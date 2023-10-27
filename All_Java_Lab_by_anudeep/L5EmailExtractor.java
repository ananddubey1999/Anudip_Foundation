import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class L5EmailExtractor {

    public static String extractMail(String GivenText) {
        String mailPattern = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
        Pattern p1 = Pattern.compile(mailPattern);
        Matcher m1 = p1.matcher(GivenText);
        
        if (m1.find()) {
            return m1.group();
        } else {
            return null;
        }
    }
    
    public static void main(String[] args) {
        String GivenText = "Hey, there how are you? this is my Mail id great123@gmail.com";
        String Mail = extractMail(GivenText);
        
        if (Mail != null) {
            System.out.println("Extracted Mail: " + Mail);
        } else {
            System.out.println("There is no Mail found in the GivenText.");
        }
    }
}

