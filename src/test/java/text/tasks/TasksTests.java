package text.tasks;

import org.junit.Test;
import text.Sentence;
import text.StuffForTasks;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TasksTests {

    @Test
    public void testTask2(){
        List<String> parsed = Sentence.orderedSentences(
                "/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit",
                Sentence.fromChortToLong);

        List<String> expected = new ArrayList<>();
        expected.add("In a hole in the ground there lived a hobbit.");
        expected.add("This hobbit was a very well-to-do hobbit, and his name was Baggins.");
        expected.add("He may have lost the neighbours’ respect, but he gained—well, you will see whether he gained anything in the end.");
        expected.add("It had a perfectly round door like a porthole, painted green, with a shiny yellow brass knob in the exact middle.");
        expected.add("This is a story of how a Baggins had an adventure, and found himself doing and saying things altogether unexpected.");
        expected.add("The best rooms were all on the left-hand side (going in), for these were the only ones to have windows, deep-set round windows looking over his garden, and meadows beyond, sloping down to the river.");
        expected.add("Not a nasty, dirty, wet hole, filled with the ends of worms and an oozy smell, nor yet a dry, bare, sandy hole with nothing in it to sit down on or to eat: it was a hobbit-hole, and that means comfort.");
        expected.add("No going upstairs for the hobbit: bedrooms, bathrooms, cellars, pantries (lots of these), wardrobes (he had whole rooms devoted to clothes), kitchens, dining-rooms, all were on the same floor, and indeed on the same passage.");
        expected.add("The tunnel wound on and on, going fairly but not quite straight into the side of the hill—The Hill, as all the people for many miles round called it—and many little round doors opened out of it, first on one side and then on another.");
        expected.add("The door opened on to a tube-shaped hall like a tunnel: a very comfortable tunnel without smoke, with panelled walls, and floors tiled and carpeted, provided with polished chairs, and lots and lots of pegs for hats and coats—the hobbit was fond of visitors.");
        expected.add("The Bagginses had lived in the neighbourhood of The Hill for time out of mind, and people considered them very respectable, not only because most of them were rich, but also because they never had any adventures or did anything unexpected: you could tell what a Baggins would say on any question without the bother of asking him.");
        for (int i=0;i<parsed.size();i++) {
            assertEquals(expected.get(i),parsed.get(i));
        }
    }

    @Test
    public void testTask6(){
    String result=StuffForTasks.task6("/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit");
    String expected= "A\nadventure\nadventures\nall\nalso\naltogether\nan\nand\nanother\nany\nanything\nas\nasking\nBAGGINS\nbagginses\nbare\nbathrooms\nbecause\nbedrooms\nbest\nbeyond\nbother\nbrass\nbut\nCALLED\ncarpeted\ncellars\nchairs\nclothes\ncoats\ncomfort\ncomfortable\nconsidered\ncould\nDEEP\ndevoted\ndid\ndining\ndirty\ndo\ndoing\ndoor\ndoors\ndown\ndry\nEAT\nend\nends\nexact\nFAIRLY\nfilled\nfirst\nfloor\nfloors\nfond\nfor\nfound\nGAINED\ngarden\ngoing\ngreen\nground\nHAD\nhall\nhand\nhats\nhave\nhe\nhill\nhim\nhimself\nhis\nhobbit\nhole\nhow\nIN\nindeed\ninto\nis\nit\nKITCHENS\nknob\nLEFT\nlike\nlittle\nlived\nlooking\nlost\nlots\nMANY\nmay\nmeadows\nmeans\nmiddle\nmiles\nmind\nmost\nNAME\nnasty\nneighbourhood\nneighbours\nnever\nno\nnor\nnot\nnothing\nOF\non\none\nones\nonly\noozy\nopened\nor\nout\nover\nPAINTED\npanelled\npantries\npassage\npegs\npeople\nperfectly\npolished\nporthole\nprovided\nQUESTION\nquite\nRESPECT\nrespectable\nrich\nriver\nrooms\nround\nSAME\nsandy\nsay\nsaying\nsee\nset\nshaped\nshiny\nside\nsit\nsloping\nsmell\nsmoke\nstory\nstraight\nTELL\nthat\nthe\nthem\nthen\nthere\nthese\nthey\nthings\nthis\ntiled\ntime\nto\ntube\ntunnel\nUNEXPECTED\nupstairs\nVERY\nvisitors\nWALLS\nwardrobes\nwas\nwell\nwere\nwet\nwhat\nwhether\nwhole\nwill\nwindows\nwith\nwithout\nworms\nwould\nwound\nYELLOW\nyet\nyou";
    assertEquals(expected,result);
    }

    @Test
    public void testTask7(){
        String result=StuffForTasks.task7("/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit");
        String expected= "a\nyou\noozy\nyet\neat\nout\none\nany\nsay\nmay\nsee\nquite\nbecause\nin\nhole\nof\nan\nbare\nit\nto\non\nor\ndoor\nlike\nyellow\nopened\ntube\nvery\nfairly\ninto\nside\nas\npeople\nmany\nno\nhe\nwere\nsame\nindeed\nonly\nones\nhave\ndeep\nover\nbeyond\ndo\nname\ntime\nalso\nthey\nquestion\nis\nsaying\ngained\nneighbourhood\nadventure\npainted\nwithout\nanother\ndevoted\npassage\nlooking\nmeadows\nthere\nlived\nnasty\ndirty\nsandy\nmeans\nround\ngreen\nshiny\nexact\nsmoke\ntiled\ncoats\nwound\ngoing\nmiles\ndoors\nthese\nwhole\nrooms\nfloor\nriver\nconsidered\nnever\nadventures\nunexpected\ncould\nwould\nstory\nfound\ndoing\naltogether\nneighbours\nporthole\npanelled\ncarpeted\nprovided\npolished\nvisitors\nupstairs\nbedrooms\npantries\nanything\ncomfortable\nrespectable\nthe\nground\nhobbit\nnot\nwet\nfilled\nand\nnor\ndry\nsit\nwas\nhad\nperfectly\nmiddle\nshaped\ntunnel\nfloors\nchairs\nfor\nbut\nall\ncalled\nlittle\nbathrooms\nwardrobes\ndining\nset\nhis\ngarden\nbagginses\ndid\nbother\nasking\nhim\nhow\nend\nnothing\ncomfort\ncellars\nclothes\nwindows\nsloping\nbaggins\nhimself\nrespect\nwhether\nwith\nends\ndown\nthat\nknob\nhall\nlots\npegs\nhats\nfond\nstraight\nhill\nthen\nkitchens\nbest\nleft\nhand\nthis\nwell\nmind\nthem\nmost\nrich\ntell\nwhat\nlost\nwill\nworms\nsmell\nbrass\nwalls\nfirst\nthings";
        assertEquals(expected,result);
    }

    @Test
    public void testTask8(){
        String result=StuffForTasks.task8("/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit");
        String expected= "a\nyou\nadventures\nadventure\nof\nyellow\nall\nalso\naltogether\nin\nends\nand\nan\non\ninto\none\nanother\nindeed\nonly\nones\nany\nanything\nunexpected\nend\nopened\nupstairs\nor\nas\nasking\nis\nyet\nit\neat\nout\nover\nexact\noozy";
        assertEquals(expected,result);
    }

    @Test
    public void testTask9(){
        String result=StuffForTasks.task9("/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit",'e');
        String expected= "respectable\nunexpected\nadventure\nadventures\naltogether\nbecause\ncarpeted\nconsidered\ndeep\ndevoted\ngreen\nindeed\nnever\nopened\npanelled\npeople\nperfectly\nrespect\nsee\nthere\nthese\nwere\nwhether\nanother\nbagginses\nbare\nbedrooms\nbest\nbeyond\nbother\ncalled\ncellars\nclothes\ncomfortable\neat\nend\nends\nexact\nfilled\ngained\ngarden\nhave\nhe\nhimself\nhole\nkitchens\nleft\nlike\nlittle\nlived\nmeadows\nmeans\nmiddle\nmiles\nname\nneighbourhood\nneighbours\none\nones\nover\npainted\npantries\npassage\npegs\npolished\nporthole\nprovided\nquestion\nquite\nriver\nsame\nset\nshaped\nside\nsmell\nsmoke\ntell\nthe\nthem\nthen\nthey\ntiled\ntime\ntube\ntunnel\nvery\nwardrobes\nwell\nwet\nwhole\nyellow\nyet\na\nall\nalso\nan\nand\nany\nanything\nas\nasking\nbaggins\nbathrooms\nbrass\nbut\nchairs\ncoats\ncomfort\ncould\ndid\ndining\ndirty\ndo\ndoing\ndoor\ndoors\ndown\ndry\nfairly\nfirst\nfloor\nfloors\nfond\nfor\nfound\ngoing\nground\nhad\nhall\nhand\nhats\nhill\nhim\nhis\nhobbit\nhow\nin\ninto\nis\nit\nknob\nlooking\nlost\nlots\nmany\nmay\nmind\nmost\nnasty\nno\nnor\nnot\nnothing\nof\non\nonly\noozy\nor\nout\nrich\nrooms\nround\nsandy\nsay\nsaying\nshiny\nsit\nsloping\nstory\nstraight\nthat\nthings\nthis\nto\nupstairs\nvisitors\nwalls\nwas\nwhat\nwill\nwindows\nwith\nwithout\nworms\nwould\nwound\nyou";
        assertEquals(expected,result);
//        System.out.println(result);
    }

    @Test
    public void testTask13(){
        String result=StuffForTasks.task13("/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit",'e');
        String expected= "a\nall\nalso\nan\nand\nany\nanything\nas\nasking\nbaggins\nbathrooms\nbrass\nbut\nchairs\ncoats\ncomfort\ncould\ndid\ndining\ndirty\ndo\ndoing\ndoor\ndoors\ndown\ndry\nfairly\nfirst\nfloor\nfloors\nfond\nfor\nfound\ngoing\nground\nhad\nhall\nhand\nhats\nhill\nhim\nhis\nhobbit\nhow\nin\ninto\nis\nit\nknob\nlooking\nlost\nlots\nmany\nmay\nmind\nmost\nnasty\nno\nnor\nnot\nnothing\nof\non\nonly\noozy\nor\nout\nrich\nrooms\nround\nsandy\nsay\nsaying\nshiny\nsit\nsloping\nstory\nstraight\nthat\nthings\nthis\nto\nupstairs\nvisitors\nwalls\nwas\nwhat\nwill\nwindows\nwith\nwithout\nworms\nwould\nwound\nyou\nanother\nbagginses\nbare\nbedrooms\nbest\nbeyond\nbother\ncalled\ncellars\nclothes\ncomfortable\neat\nend\nends\nexact\nfilled\ngained\ngarden\nhave\nhe\nhimself\nhole\nkitchens\nleft\nlike\nlittle\nlived\nmeadows\nmeans\nmiddle\nmiles\nname\nneighbourhood\nneighbours\none\nones\nover\npainted\npantries\npassage\npegs\npolished\nporthole\nprovided\nquestion\nquite\nriver\nsame\nset\nshaped\nside\nsmell\nsmoke\ntell\nthe\nthem\nthen\nthey\ntiled\ntime\ntube\ntunnel\nvery\nwardrobes\nwell\nwet\nwhole\nyellow\nyet\nadventure\nadventures\naltogether\nbecause\ncarpeted\nconsidered\ndeep\ndevoted\ngreen\nindeed\nnever\nopened\npanelled\npeople\nperfectly\nrespect\nsee\nthere\nthese\nwere\nwhether\nrespectable\nunexpected";
        assertEquals(expected,result);
    }

    @Test
    public void testTask3(){
        String result=StuffForTasks.task3("/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit");
        String expected= "ground\nthere";
        assertEquals(expected,result);
    }
}