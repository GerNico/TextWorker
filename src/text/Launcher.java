package text;

import java.util.List;

public class Launcher {
    public static void main(String[] args) {
        List<String> sentences=Sentence.orderedSentences(
                "/home/matsishin/Desktop/TextWorker/src/text/Hobbit",
                Sentence.fromChortToLong);
        for (String s:sentences) {
            System.out.println(s);
        }
    }
}
