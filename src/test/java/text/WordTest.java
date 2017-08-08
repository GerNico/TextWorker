package text;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class WordTest {

    @Test
    public void testWord(){
        String testSentence="Now goblins are cruel, wicked, and bad-hearted.";
        List<String> parsed=Word.parseWordsFromString(testSentence);
        ArrayList<String> expected= new ArrayList<>();
        expected.add("Now");
        expected.add("goblins");
        expected.add("are");
        expected.add("cruel");
        expected.add("wicked");
        expected.add("and");
        expected.add("bad-hearted");
        for (int i=0;i<parsed.size();i++) {
            assertEquals(expected.get(i),parsed.get(i));
        }
    }
}