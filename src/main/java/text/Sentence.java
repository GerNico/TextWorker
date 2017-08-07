package text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
    private static final String regex ="[^.!?\\s”][^.!?]*" +
            "(?:[.!?](?!['\"”]?\\s|$)[^.!?]*)*" +
            "[.!?]?['\"”]?(?=\\s|$)";


    public static List<String> parseAllSentences(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            List<String> sentences = new ArrayList<>(200);
            while (scanner.hasNextLine()) {
                sentences.addAll(parseSentencesFromString(scanner.nextLine()));
            }
            return sentences;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static List<String> parseSentencesFromString(String content) {
        Pattern re = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher reMatcher = re.matcher(content);
        List<String> sentences = new ArrayList<>();
        while (reMatcher.find()) {
            sentences.add(reMatcher.group().trim());
        }
        return sentences;
    }

    public static List<String> orderedSentences(String filename, Comparator comparator){
       List<String> allSentences= parseAllSentences(filename);
        allSentences.sort(comparator);
        return allSentences;
    }

    public final static Comparator<String> fromChortToLong=(a, b)->{
        if(a.length()>b.length()) return 1;
        if(a.length()<b.length()) return -1;
        if(a.length()== b.length()) {
            for (int i = 0; i <a.length() ; i++) {
                if (a.charAt(i)>b.charAt(i)) return 1;
                if (a.charAt(i)<b.charAt(i)) return -1;
            }
        }
            return 0;
    };
}
