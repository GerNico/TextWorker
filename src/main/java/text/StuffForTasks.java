package text;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
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
        List<String> wordsFromFirst = Word.parseWordsFromString(parsedSentences.get(0));
        wordsFromFirst = wordsFromFirst.stream().map(s -> s = s.toLowerCase()).distinct().collect(Collectors.toList());

        List<String> otherWords = new ArrayList<>();
        for (int i = 1; i < parsedSentences.size(); i++) {
            otherWords.addAll(Word.parseWordsFromString(parsedSentences.get(i)));
        }

        otherWords = otherWords.stream().map(s -> s = s.toLowerCase()).distinct().collect(Collectors.toList());

        List<String> finalOtherWords = otherWords;
        wordsFromFirst = wordsFromFirst.stream().filter(s -> !finalOtherWords.contains(s)).collect(Collectors.toList());

        StringJoiner sj = new StringJoiner("\n");
        for (String s : wordsFromFirst) {
            sj.add(s);
        }
        return sj.toString();
    }

    public static String task1(String fileName) {
        List<String> parsedSentences = Sentence.parseAllSentences(fileName);
        List<List<String>> wordsInSentences = new ArrayList<>();

        for (String parsedSentence : parsedSentences) {
            wordsInSentences.add(Word.parseWordsFromString(parsedSentence).stream().
                    map(s -> s = s.toLowerCase()).
                    distinct().collect(Collectors.toList()));
        }
        Map<String, Long> map = wordsInSentences.stream().flatMap(Collection::stream).collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long frequency = 0;
        List<String> theFrequent = new ArrayList<>();
        for (String record : map.keySet()) {
            Long freq = map.get(record);
            if (freq == frequency) {
                theFrequent.add(record);
            }
            if (freq > frequency) {
                frequency = freq;
                theFrequent.clear();
                theFrequent.add(record);
            }
        }
        StringJoiner sj = new StringJoiner("\n");
        for (String word : theFrequent) {
            sj.add(map.get(word) + " sentences contains word \"" + word + "\"");
        }
        return sj.toString();
    }

    public static String task4(String fileName) {
        List<String> parsedSentences = Sentence.parseAllSentences(fileName);
        StringJoiner sj = new StringJoiner("\n");

        Predicate<String> predicate = s -> s.contains("?");
        Predicate<String> length4 = s -> s.length() == 4;
        parsedSentences.stream().filter(predicate).flatMap(item -> Word.parseWordsFromString(item).stream()).
                map(item -> item = item.toLowerCase()).filter(length4).distinct().sorted().forEach(sj::add);
        return sj.toString();
    }

    public static String task5(String fileName) {
        List<String> parsedSentences = Sentence.parseAllSentences(fileName);
        StringJoiner sj = new StringJoiner("\n");

        Function<String, String> replaceWords = sentence -> {
            List<String> list = Word.parseWordsFromString(sentence);
            sentence = sentence.replaceFirst(list.get(list.size() - 1), list.get(0));
            sentence = sentence.replaceFirst(list.get(0), list.get(list.size() - 1));
            return sentence;
        };

        parsedSentences.stream().map(replaceWords).forEach(sj::add);
        return sj.toString();
    }

    public static String task11(String fileName, char limiter) {
        List<String> parsedSentences = Sentence.parseAllSentences(fileName);
        StringJoiner sj = new StringJoiner("\n");

        Function<String, String> replaceWords = (String sentence) -> {
            String answer = sentence;
            if (sentence.contains("" + limiter)) {
                answer = sentence.substring(0, sentence.indexOf(limiter)) +
                        sentence.substring(sentence.lastIndexOf(limiter) + 1, sentence.length() - 1);
            }
            return answer;
        };

        parsedSentences.stream().map(replaceWords).forEach(sj::add);
        return sj.toString();
    }

    public static String task10(String fileName, List<String> words) {
        List<String> parsedWords = Word.getAllWords(fileName);
        Map<String, Long> unsortMap = new HashMap<>();
        StringJoiner sj = new StringJoiner("\n");

        Consumer<String> consumer = word -> {
            long i;
            i = parsedWords.stream().filter(word::equals).count();
            unsortMap.put(word, i);
        };

        words.forEach(consumer);

        Map<String, Long> sortedMap = new LinkedHashMap<>();
        unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        sortedMap.entrySet().forEach(item -> sj.add(item.toString()));
        return sj.toString();
    }

    public static String task2(String fileName) {
        StringJoiner sj = new StringJoiner("\n");

        Comparator<String> comparator = (a, b) -> {
            int aN, bN;
            aN = Word.parseWordsFromString(a).size();
            bN = Word.parseWordsFromString(b).size();
            return aN - bN;
        };
        List<String> allSentences = Sentence.parseAllSentences(fileName);
        allSentences.sort(comparator);
        allSentences.forEach(sj::add);

        return sj.toString();
    }

    public static String task12(String fileName, int length) {
        String initial = Sentence.readAllLines(fileName);
        if (length > 1) initial = initial.replaceAll(
                "(?<![\\p{L}\\p{N}-])[^aeiouAEIOU][\\p{L}\\p{N}-]{" + (length - 1) + "}(?![\\p{L}\\p{N}-])", "");
        return initial;
    }

    public static String task15(String fileName) {
        String initial = Sentence.readAllLines(fileName);
        String wordRegex = "[\\p{L}\\p{N}-]+";
        Pattern pattern1 = Pattern.compile(wordRegex);
        Matcher m = pattern1.matcher(initial);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group(0).replaceAll(m.group(0).substring(0, 1), ""));
        }
        return sb.toString();
    }


    public static String task14(String fileName) {
        String initial = Sentence.readAllLines(fileName);
        Set<CharSequence> palindromesSet = new HashSet<>();

        if (initial.length() <= 2) {
            palindromesSet = Collections.emptySet();
        }
        int length = initial.length();
        for (int i = 1; i <= length; i++) {
            for (int j = i - 1, k = i; j >= 0 && k < length; j--, k++) {
                if (initial.charAt(j) == initial.charAt(k)) {
                    palindromesSet.add(initial.subSequence(j, k + 1));
                } else {
                    break;
                }
            }
        }
        String result = "";
        for (CharSequence palindrome : palindromesSet) {
            if (palindrome.length() > result.length()) result = (String) palindrome;
        }
        return result;
    }

    public static String task16(String fileName, int length, String replacement) {
        String initial = Sentence.readAllLines(fileName);
        String wordForReplacement = "(?<![\\p{L}\\p{N}-])([\\p{L}\\p{N}-]{" + length + "})(?![\\p{L}\\p{N}-])";

        Pattern pattern1 = Pattern.compile(Sentence.getRegex());
        Matcher m = pattern1.matcher(initial);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group().replaceAll(wordForReplacement, replacement));
        }
        return sb.toString();
    }

}
