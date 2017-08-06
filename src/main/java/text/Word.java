package text;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Word {
    private static String regex="(?![\\p{Punct}\\p{Space}\\p{Z}])[\\p{L}\\p{N}]+";

    public static List<String> parseWordsFromString(String sentence) {
        List<String> words=new ArrayList<>();
        Pattern pattern=Pattern.compile(regex);
        Matcher reMatcher=pattern.matcher(sentence);
        while (reMatcher.find()) {
            words.add(reMatcher.group().trim());
        }
        return words;
    }
}
