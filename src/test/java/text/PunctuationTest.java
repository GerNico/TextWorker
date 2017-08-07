package text;

import org.junit.Test;

import static org.junit.Assert.*;

public class PunctuationTest {

    @Test
    public void testReplecement() {
        String testString="Chip the glasses and crack the plates!\n" +
                "\tBlunt the knives and bend the forks!\n" +
                "That’s what Bilbo Baggins hates–\n" +
                "\tSmash the bottles and burn the corks!\n" +
                "\n" +
                "Cut the cloth and tread on the fat!\n" +
                "      Pour the milk on the pantry floor!\n" +
                "Leave the bones on the bedroom mat!\n" +
                "\tSplash the wine on every door!\n" +
                "\n" +
                "Dump the crocks in a boiling bowl;\n" +
                "\tPound them up with a thumping pole;\n" +
                "And when you’ve finished, if any are whole,\n" +
                "     Send them down the hall to roll!\n" +
                "\n" +
                "That’s what Bilbo Baggins hates!\n" +
                "So, carefully! carefully with the plates!";
        String expectedString="Chip the glasses and crack the plates!\n" +
                " Blunt the knives and bend the forks!\n" +
                "That’s what Bilbo Baggins hates–\n" +
                " Smash the bottles and burn the corks!\n" +
                "\n" +
                "Cut the cloth and tread on the fat!\n" +
                " Pour the milk on the pantry floor!\n" +
                "Leave the bones on the bedroom mat!\n" +
                " Splash the wine on every door!\n" +
                "\n" +
                "Dump the crocks in a boiling bowl;\n" +
                " Pound them up with a thumping pole;\n" +
                "And when you’ve finished, if any are whole,\n" +
                " Send them down the hall to roll!\n" +
                "\n" +
                "That’s what Bilbo Baggins hates!\n" +
                "So, carefully! carefully with the plates!";
        String resultString=Punctuation.replaceTabs(testString);
        assertEquals(expectedString,resultString);
//        System.out.println(resultString);
    }
}