package text;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
    private static final String regex = "[^.!?\\s”][^.!?]*" +
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

    public static String readAllLines(String fileName) {
        StringBuilder sb = new StringBuilder();

        File file = new File( fileName);

        try {
            try (BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()))) {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}
