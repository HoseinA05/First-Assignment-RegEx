import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {

    /*
    implement the method below so that it extracts a URL from a String
    I will write the basics for this one method, you will have to implement the other two methods from scratch
    */

    public static String extractURL(String text) {
//        String regex = "\\b(?:https?|ftp)://\\S+\\b";
        String regex = "\\b(https?)://\\S+\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        }else{
            return null;
        }
    }

    /*
    implement the method below to validate an email address
     */

    public static boolean validateEmail(String email) {
        String regex = "\\b[\\w.\\-_]+@\\w+\\.\\S+\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.find();
    }

    /*
    implement the method below so that it returns a list of words with repeated letters
    */

    public static List<String> findWordsWithRepeatLetters(String input) {
        List<String> wordsWithRepeatLetters = new ArrayList<>();
        String regex = "\\b\\w*(\\w)\\1\\w*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            wordsWithRepeatLetters.add(matcher.group());
        }
        return wordsWithRepeatLetters;
    }

    /*
    Bonus Problem ;)
    implement the method below so that it returns a list of words that are repeated twice accidentally in a string
    for example: "appleapple orange pearpear pineapple" -> ["appleapple", "pearpear"]
    */

    public static List<String> findReapetdWords(String input) {
        List<String> repeatedWords = new ArrayList<>();
        return repeatedWords;
        // TODO
    }

    public static void main(String[] args) {
//        String text = "and another hello_World@geeksforgeeks.org URL: http://www.example.org/";
//        boolean extractedURL = validateEmail(text);
//        System.out.println("Extracted URL: " + extractedURL);
//        System.out.print(extractedURL);
//        String input = "apple orange pear pineapple banana sentence with some words like hello, book, and happy.";
//        List<String> wordsWithRepeatLetters = findWordsWithRepeatLetters(input);
//        System.out.println("Words with repeated letters: " + wordsWithRepeatLetters);
    }
}