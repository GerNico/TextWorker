package text;

import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StuffForTasks {
    public static String task6(String fileName) {
        List<String> parsed = Word.getAllWords(fileName);
        parsed = parsed.stream().map(s -> s = s.toLowerCase()).distinct().sorted().collect(Collectors.toList());
        char previosChar = '\u0003';
        StringBuilder result = new StringBuilder();
        for (String aParsed : parsed) {
            if (aParsed.charAt(0) == previosChar) {
                result.append(aParsed).append("\n");
                previosChar = aParsed.charAt(0);
            } else {
                result.append(aParsed.toUpperCase()).append("\n");
                previosChar = aParsed.charAt(0);
            }
        }
        result.deleteCharAt(result.lastIndexOf("\n"));
        return result.toString();
    }

    public static String task7(String fileName) {
        List<String> parsed = Word.getAllWords(fileName);
        Comparator<String> c = (a, b) -> {
            int aN = 0;
            int bN = 0;
            Pattern vowels = Pattern.compile("[aeiouy]", Pattern.CASE_INSENSITIVE);
            Matcher mA = vowels.matcher(a);
            Matcher mB = vowels.matcher(b);
            while (mA.find()) aN++;
            while (mB.find()) bN++;
            return -(100 * aN) / a.length() + (bN * 100) / b.length();
        };
        parsed = parsed.stream().map(s -> s = s.toLowerCase()).distinct().sorted(c).collect(Collectors.toList());
        StringBuilder result = new StringBuilder();
        for (String aParsed : parsed) {
            result.append(aParsed).append("\n");
        }
        result.deleteCharAt(result.lastIndexOf("\n"));
        return result.toString();
    }

    public static String task8(String fileName) {
        List<String> parsed = Word.getAllWords(fileName);
        Predicate<String> f = string -> {
            Pattern vowels = Pattern.compile("[aeiouy].*", Pattern.CASE_INSENSITIVE);
            Matcher matcher = vowels.matcher(string);
            return matcher.matches();
        };
        Comparator<String> c = (a, b) -> {
            Pattern vowels = Pattern.compile("[^aeiouy].*", Pattern.CASE_INSENSITIVE);
            Matcher matcherA = vowels.matcher(a);
            Matcher matcherB = vowels.matcher(b);
            String s1 = "", s2 = "";
            while (matcherA.find()) s1 = matcherA.group();
            while (matcherB.find()) s2 = matcherB.group();
            if (s1.equals("") && s2.equals("")) return 0;
            if (s1.equals("")) return -1;
            if (s2.equals("")) return 1;
            return (int) (s1.charAt(0) - s2.charAt(0));
        };
        parsed = parsed.stream().map(s -> s = s.toLowerCase()).distinct().filter(f).sorted(c).collect(Collectors.toList());
        StringJoiner result = new StringJoiner("\n");
        for (String aParsed : parsed) {
            result.add(aParsed);
        }
        return result.toString();
    }

    public static String task9(String fileName, char targetLetter) {
        List<String> parsed = Word.getAllWords(fileName);
        Comparator<String> c = (a, b) -> {
            int aN = 0, bN = 0;
            for (char ch : a.toCharArray()) {
                if (ch == targetLetter) aN++;
            }
            for (char ch : b.toCharArray()) {
                if (ch == targetLetter) bN++;
            }
            if (aN != bN) {
                return (int) (-aN + bN);
            } else {
                return a.compareTo(b);
            }
        };
        parsed = parsed.stream().map(s -> s = s.toLowerCase()).distinct().sorted(c).collect(Collectors.toList());
        StringJoiner result = new StringJoiner("\n");
        for (String aParsed : parsed) {
            result.add(aParsed);
        }
        return result.toString();
    }

    public static String task13(String fileName, char targetLetter) {
        List<String> parsed = Word.getAllWords(fileName);
        Comparator<String> c = (a, b) -> {
            int aN = 0, bN = 0;
            for (char ch : a.toCharArray()) {
                if (ch == targetLetter) aN++;
            }
            for (char ch : b.toCharArray()) {
                if (ch == targetLetter) bN++;
            }
            if (aN != bN) {
                return (int) (aN - bN);
            } else {
                return a.compareTo(b);
            }
        };
        parsed = parsed.stream().map(s -> s = s.toLowerCase()).distinct().sorted(c).collect(Collectors.toList());
        StringJoiner result = new StringJoiner("\n");
        for (String aParsed : parsed) {
            result.add(aParsed);
        }
        return result.toString();
    }

    public static String task3(String fileName) {
        List<String> parsedSentences = Sentence.parseAllSentences(fileName);
        List<String> wordsFromFirst=Word.parseWordsFromString(parsedSentences.get(0));
        wordsFromFirst = wordsFromFirst.stream().map(s -> s = s.toLowerCase()).distinct().collect(Collectors.toList());

        List<String> otherWords=new ArrayList<>();
        for (int i = 1; i <parsedSentences.size() ; i++) {
            otherWords.addAll(Word.parseWordsFromString(parsedSentences.get(i)));
        }

        otherWords = otherWords.stream().map(s -> s = s.toLowerCase()).distinct().collect(Collectors.toList());

        List<String> finalOtherWords = otherWords;
        wordsFromFirst=wordsFromFirst.stream().filter(s -> !finalOtherWords.contains(s)).collect(Collectors.toList());

        StringJoiner sj=new StringJoiner("\n");
        for (String s:wordsFromFirst) {
            sj.add(s);
        }
        return sj.toString();
    }
}
