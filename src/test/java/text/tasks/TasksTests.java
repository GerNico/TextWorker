package text.tasks;

import org.junit.Test;
import text.Sentence;
import text.StuffForTasks;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TasksTests {

    @Test
    public void testTask2() {
        String parsed = StuffForTasks.task2("/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit");

        String expected = "In a hole in the ground there lived a hobbit.\n" +
                "This hobbit was a very well-to-do hobbit, and his name was Baggins.\n" +
                "This is a story of how a Baggins had an adventure, and found himself doing and saying things altogether unexpected.\n" +
                "It had a perfectly round door like a porthole, painted green, with a shiny yellow brass knob in the exact middle.\n" +
                "He may have lost the neighbours’ respect, but he gained—well, you will see whether he gained anything in the end.\n" +
                "No going upstairs for the hobbit: bedrooms, bathrooms, cellars, pantries (lots of these), wardrobes (he had whole rooms devoted to clothes), kitchens, dining-rooms, all were on the same floor, and indeed on the same passage.\n" +
                "The best rooms were all on the left-hand side (going in), for these were the only ones to have windows, deep-set round windows looking over his garden, and meadows beyond, sloping down to the river.\n" +
                "Not a nasty, dirty, wet hole, filled with the ends of worms and an oozy smell, nor yet a dry, bare, sandy hole with nothing in it to sit down on or to eat: it was a hobbit-hole, and that means comfort.\n" +
                "The door opened on to a tube-shaped hall like a tunnel: a very comfortable tunnel without smoke, with panelled walls, and floors tiled and carpeted, provided with polished chairs, and lots and lots of pegs for hats and coats—the hobbit was fond of visitors.\n" +
                "The tunnel wound on and on, going fairly but not quite straight into the side of the hill—The Hill, as all the people for many miles round called it—and many little round doors opened out of it, first on one side and then on another.\n" +
                "The Bagginses had lived in the neighbourhood of The Hill for time out of mind, and people considered them very respectable, not only because most of them were rich, but also because they never had any adventures or did anything unexpected: you could tell what a Baggins would say on any question without the bother of asking him.";
        assertEquals(expected, parsed);
    }

    @Test
    public void testTask6() {
        String result = StuffForTasks.task6("/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit");
        String expected = "A\nadventure\nadventures\nall\nalso\naltogether\nan\nand\nanother\nany\nanything\nas\nasking\nBAGGINS\nbagginses\nbare\nbathrooms\nbecause\nbedrooms\nbest\nbeyond\nbother\nbrass\nbut\nCALLED\ncarpeted\ncellars\nchairs\nclothes\ncoats\ncomfort\ncomfortable\nconsidered\ncould\nDEEP-SET\ndevoted\ndid\ndining-rooms\ndirty\ndoing\ndoor\ndoors\ndown\ndry\nEAT\nend\nends\nexact\nFAIRLY\nfilled\nfirst\nfloor\nfloors\nfond\nfor\nfound\nGAINED\ngarden\ngoing\ngreen\nground\nHAD\nhall\nhats\nhave\nhe\nhill\nhim\nhimself\nhis\nhobbit\nhobbit-hole\nhole\nhow\nIN\nindeed\ninto\nis\nit\nKITCHENS\nknob\nLEFT-HAND\nlike\nlittle\nlived\nlooking\nlost\nlots\nMANY\nmay\nmeadows\nmeans\nmiddle\nmiles\nmind\nmost\nNAME\nnasty\nneighbourhood\nneighbours\nnever\nno\nnor\nnot\nnothing\nOF\non\none\nones\nonly\noozy\nopened\nor\nout\nover\nPAINTED\npanelled\npantries\npassage\npegs\npeople\nperfectly\npolished\nporthole\nprovided\nQUESTION\nquite\nRESPECT\nrespectable\nrich\nriver\nrooms\nround\nSAME\nsandy\nsay\nsaying\nsee\nshiny\nside\nsit\nsloping\nsmell\nsmoke\nstory\nstraight\nTELL\nthat\nthe\nthem\nthen\nthere\nthese\nthey\nthings\nthis\ntiled\ntime\nto\ntube-shaped\ntunnel\nUNEXPECTED\nupstairs\nVERY\nvisitors\nWALLS\nwardrobes\nwas\nwell\nwell-to-do\nwere\nwet\nwhat\nwhether\nwhole\nwill\nwindows\nwith\nwithout\nworms\nwould\nwound\nYELLOW\nyet\nyou";
        assertEquals(expected, result);
    }

    @Test
    public void testTask7() {
        String result = StuffForTasks.task7("/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit");
        String expected = "a\nyou\noozy\nyet\neat\nout\none\nany\nsay\nmay\nsee\nquite\nbecause\nin\nhole\nof\nan\nbare\nit\nto\non\nor\ndoor\nlike\nyellow\nopened\nvery\nfairly\ninto\nside\nas\npeople\nmany\nno\nhe\nwere\nsame\nindeed\nonly\nones\nhave\nover\nbeyond\nname\ntime\nalso\nthey\nquestion\nis\nsaying\ngained\nneighbourhood\nadventure\npainted\nwithout\nanother\ndevoted\npassage\nlooking\nmeadows\nthere\nlived\nnasty\ndirty\nsandy\nmeans\nround\ngreen\nshiny\nexact\nsmoke\ntiled\ncoats\nwound\ngoing\nmiles\ndoors\nthese\nwhole\nrooms\nfloor\nriver\nconsidered\nnever\nadventures\nunexpected\ncould\nwould\nstory\nfound\ndoing\naltogether\nneighbours\nporthole\npanelled\ncarpeted\nprovided\npolished\nvisitors\nupstairs\nbedrooms\npantries\ndeep-set\nanything\nhobbit-hole\ntube-shaped\ncomfortable\nrespectable\nthe\nground\nhobbit\nnot\nwet\nfilled\nand\nnor\ndry\nsit\nwas\nhad\nperfectly\nmiddle\ntunnel\nfloors\nchairs\nfor\nbut\nall\ncalled\nlittle\nbathrooms\nwardrobes\ndining-rooms\nhis\ngarden\nbagginses\ndid\nbother\nasking\nhim\nhow\nend\nwell-to-do\nnothing\ncomfort\ncellars\nclothes\nwindows\nsloping\nbaggins\nhimself\nrespect\nwhether\nwith\nends\ndown\nthat\nknob\nhall\nlots\npegs\nhats\nfond\nstraight\nhill\nthen\nkitchens\nbest\nthis\nmind\nthem\nmost\nrich\ntell\nwhat\nlost\nwell\nwill\nleft-hand\nworms\nsmell\nbrass\nwalls\nfirst\nthings";
        assertEquals(expected, result);
    }

    @Test
    public void testTask8() {
        String result = StuffForTasks.task8("/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit");
        String expected = "a\nyou\nadventures\nadventure\nof\nyellow\nall\nalso\naltogether\nin\nends\nand\nan\non\ninto\none\nanother\nindeed\nonly\nones\nany\nanything\nunexpected\nend\nopened\nupstairs\nor\nas\nasking\nis\nyet\nit\neat\nout\nover\nexact\noozy";
        assertEquals(expected, result);
    }

    @Test
    public void testTask9() {
        String result = StuffForTasks.task9("/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit", 'e');
        String expected = "deep-set\nrespectable\nunexpected\nadventure\nadventures\naltogether\nbecause\ncarpeted\nconsidered\ndevoted\ngreen\nindeed\nnever\nopened\npanelled\npeople\nperfectly\nrespect\nsee\nthere\nthese\ntube-shaped\nwere\nwhether\nanother\nbagginses\nbare\nbedrooms\nbest\nbeyond\nbother\ncalled\ncellars\nclothes\ncomfortable\neat\nend\nends\nexact\nfilled\ngained\ngarden\nhave\nhe\nhimself\nhobbit-hole\nhole\nkitchens\nleft-hand\nlike\nlittle\nlived\nmeadows\nmeans\nmiddle\nmiles\nname\nneighbourhood\nneighbours\none\nones\nover\npainted\npantries\npassage\npegs\npolished\nporthole\nprovided\nquestion\nquite\nriver\nsame\nside\nsmell\nsmoke\ntell\nthe\nthem\nthen\nthey\ntiled\ntime\ntunnel\nvery\nwardrobes\nwell\nwell-to-do\nwet\nwhole\nyellow\nyet\na\nall\nalso\nan\nand\nany\nanything\nas\nasking\nbaggins\nbathrooms\nbrass\nbut\nchairs\ncoats\ncomfort\ncould\ndid\ndining-rooms\ndirty\ndoing\ndoor\ndoors\ndown\ndry\nfairly\nfirst\nfloor\nfloors\nfond\nfor\nfound\ngoing\nground\nhad\nhall\nhats\nhill\nhim\nhis\nhobbit\nhow\nin\ninto\nis\nit\nknob\nlooking\nlost\nlots\nmany\nmay\nmind\nmost\nnasty\nno\nnor\nnot\nnothing\nof\non\nonly\noozy\nor\nout\nrich\nrooms\nround\nsandy\nsay\nsaying\nshiny\nsit\nsloping\nstory\nstraight\nthat\nthings\nthis\nto\nupstairs\nvisitors\nwalls\nwas\nwhat\nwill\nwindows\nwith\nwithout\nworms\nwould\nwound\nyou";
        assertEquals(expected, result);
    }

    @Test
    public void testTask13() {
        String result = StuffForTasks.task13("/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit", 'e');
        String expected = "a\nall\nalso\nan\nand\nany\nanything\nas\nasking\nbaggins\nbathrooms\nbrass\nbut\nchairs\ncoats\ncomfort\ncould\ndid\ndining-rooms\ndirty\ndoing\ndoor\ndoors\ndown\ndry\nfairly\nfirst\nfloor\nfloors\nfond\nfor\nfound\ngoing\nground\nhad\nhall\nhats\nhill\nhim\nhis\nhobbit\nhow\nin\ninto\nis\nit\nknob\nlooking\nlost\nlots\nmany\nmay\nmind\nmost\nnasty\nno\nnor\nnot\nnothing\nof\non\nonly\noozy\nor\nout\nrich\nrooms\nround\nsandy\nsay\nsaying\nshiny\nsit\nsloping\nstory\nstraight\nthat\nthings\nthis\nto\nupstairs\nvisitors\nwalls\nwas\nwhat\nwill\nwindows\nwith\nwithout\nworms\nwould\nwound\nyou\nanother\nbagginses\nbare\nbedrooms\nbest\nbeyond\nbother\ncalled\ncellars\nclothes\ncomfortable\neat\nend\nends\nexact\nfilled\ngained\ngarden\nhave\nhe\nhimself\nhobbit-hole\nhole\nkitchens\nleft-hand\nlike\nlittle\nlived\nmeadows\nmeans\nmiddle\nmiles\nname\nneighbourhood\nneighbours\none\nones\nover\npainted\npantries\npassage\npegs\npolished\nporthole\nprovided\nquestion\nquite\nriver\nsame\nside\nsmell\nsmoke\ntell\nthe\nthem\nthen\nthey\ntiled\ntime\ntunnel\nvery\nwardrobes\nwell\nwell-to-do\nwet\nwhole\nyellow\nyet\nadventure\nadventures\naltogether\nbecause\ncarpeted\nconsidered\ndevoted\ngreen\nindeed\nnever\nopened\npanelled\npeople\nperfectly\nrespect\nsee\nthere\nthese\ntube-shaped\nwere\nwhether\ndeep-set\nrespectable\nunexpected";
        assertEquals(expected, result);
    }

    @Test
    public void testTask3() {
        String result = StuffForTasks.task3("/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit");
        String expected = "ground\nthere";
        assertEquals(expected, result);
    }

    @Test
    public void testTask1() {
        String result = StuffForTasks.task1("/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit");
        String expected = "9 sentences contains word \"the\"";
        assertEquals(expected, result);
    }

    @Test
    public void testTask4() {
        String result = StuffForTasks.task4("/home/matsishin/Desktop/TextWorker/src/main/java/text/Hobbit.txt");
        String expected = "ages\nalso\naren\nasks\naway\nback\nbank\nbeen\nblue\nboat\nboil\ncall\ncame\ncamp\ncave\ncome\ncook\ndain\ndale\ndare\ndark\ndays\ndead\ndear\ndidn\ndoes\ndone\ndoor\ndori\ndown\ndrop\neast\neasy\nelse\neven\never\nfair\nfeel\nfeet\nfili\nfind\nfive\nfoes\nfolk\nfond\nfood\nfour\nfree\nfrom\ngain\ngate\ngave\ngift\ngive\nglow\ngoes\ngold\ngone\ngood\ngrey\ngrim\ngrow\nhadn\nhalf\nhall\nhand\nhave\nhear\nhelp\nhere\nhide\nhiss\nhold\nhole\nhome\nhope\nhost\nhung\nhurt\nidle\ninto\niron\njust\nkeep\nkept\nkili\nkind\nking\nknow\nlads\nlake\nlast\nlate\nlend\nlike\nlong\nlook\nlord\nlose\nlost\nlots\nloud\nluck\nmade\nmake\nmany\nmean\nmere\nmind\nmoon\nmore\nmuch\nmust\nname\nnear\nneed\nnews\nnext\nnice\nnick\nnine\nonce\nover\npair\npast\npath\npets\npick\npush\nrats\nrest\nrich\nriot\nroad\nrope\nrose\nrune\nsaid\nsame\nseek\nseem\nsent\nside\nsing\nsoft\nsole\nsome\nsong\nsons\nsoon\nsort\nstay\nstop\nsuch\ntalk\ntame\ntell\nthan\nthat\nthem\nthen\nthey\nthis\ntill\ntime\ntook\ntrot\ntrue\nturn\nused\nvery\nwant\nwarg\nwell\nwere\nwest\nwhat\nwhen\nwhom\nwill\nwish\nwith\nwolf\nword\nwork\nyour";
        assertEquals(expected, result);
    }

    @Test
    public void testTask5() {
        String result = StuffForTasks.task5("/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit");
        String expected = "hobbit a hole in the ground there lived a In.\n" +
                "comfort a nasty, dirty, wet hole, filled with the ends of worms and an oozy smell, nor yet a dry, bare, sandy hole with nothing in it to sit down on or to eat: it was a hobbit-hole, and that means Not.\n" +
                "middle had a perfectly round door like a porthole, painted green, with a shiny yellow brass knob in the exact It.\n" +
                "visitors door opened on to a tube-shaped hall like a tunnel: a very comfortable tunnel without smoke, with panelled walls, and floors tiled and carpeted, provided with polished chairs, and lots and lots of pegs for hats and coats—the hobbit was fond of The.\n" +
                "another tunnel wound on and on, going fairly but not quite straight into the side of the hill—The Hill, as all the people for many miles round called it—and many little round doors opened out of it, first on one side and then on The.\n" +
                "passage going upstairs for the hobbit: bedrooms, bathrooms, cellars, pantries (lots of these), wardrobes (he had whole rooms devoted to clothes), kitchens, dining-rooms, all were on the same floor, and indeed on the same No.\n" +
                "river best rooms were all on the left-hand side (going in), for these were the only ones to have windows, deep-set round windows looking over his garden, and meadows beyond, sloping down to the The.\n" +
                "Baggins hobbit was a very well-to-do hobbit, and his name was This.\n" +
                "him Bagginses had lived in the neighbourhood of The Hill for time out of mind, and people considered them very respectable, not only because most of them were rich, but also because they never had any adventures or did anything unexpected: you could tell what a Baggins would say on any question without the bother of asking The.\n" +
                "unexpected is a story of how a Baggins had an adventure, and found himself doing and saying things altogether This.\n" +
                "end may have lost the neighbours’ respect, but he gained—well, you will see whether he gained anything in the He.";
        assertEquals(expected, result);
    }

    @Test
    public void testTask11() {
        String result = StuffForTasks.task11("/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit", 'e');
        String expected = "In a hold a hobbit\nNot a nasty, dirty, wans comfort\nIt had a p\nTh hobbit was fond of visitors\nThr\nNo going upstairs for th\nThr\nThis hobbit was a v was Baggins\nThr of asking him\nThis is a story of how a Baggins had an advd\nHnd";
        assertEquals(expected, result);
    }

    @Test
    public void testTask10() {
        List<String> words = new ArrayList<>();
        words.add("Baggins");
        words.add("the");
        words.add("door");
        String result = StuffForTasks.task10("/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit", words);
        String expected = "the=17\n" +
                "Baggins=3\n" +
                "door=2";
        assertEquals(expected, result);
    }

    @Test
    public void testTask12() {
        String result = StuffForTasks.task12("/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit", 4);
        String expected = "In a  in the ground there lived a hobbit. a nasty, dirty, , filled  the ends of worms and an oozy smell, yet a dry, , sandy   nothing in it to sit  on or to eat: it was a hobbit-hole,  means comfort.\n" +
                "It had a perfectly round   a porthole, painted green,  a shiny yellow brass  in the exact middle.  opened on to a tube-shaped   a tunnel: a  comfortable tunnel without smoke,  panelled walls, floors tiled and carpeted, provided  polished chairs,  and  of  for  and coats—the hobbit was  of visitors. tunnel wound on and on, going fairly but not quite straight into the  of the —The , as all the people for  miles round called it—and  little round doors opened out of it, first on one  and  on another. No going upstairs for the hobbit: bedrooms, bathrooms, cellars, pantries ( of these), wardrobes (he had whole rooms devoted to clothes), kitchens, dining-rooms,  on the  floor, indeed on the  passage.  rooms  all on the left-hand  (going in), these  the only ones to  windows, deep-set round windows looking over his garden, meadows beyond, sloping  to the river.\n" +
                " hobbit was a  well-to-do hobbit, his  was Baggins. Bagginses had lived in the neighbourhood of The  for  out of , people considered   respectable, only because  of   , also because  never had any adventures or did anything unexpected: could   a Baggins would say on any question without the bother of asking him.  is a story of how a Baggins had an adventure, found himself doing and saying things altogether unexpected. He may   the neighbours’ respect, he gained—,  see whether he gained anything in the end.\n";
        assertEquals(expected, result);
    }

    @Test
    public void testTask14() {
        String result = StuffForTasks.task14("/home/matsishin/Desktop/TextWorker/src/main/java/text/Hobbit.txt");
        String expected = " redder ";
        assertEquals(expected, result);
    }

    @Test
    public void testTask15() {
        String result = StuffForTasks.task15("/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit");
        String expected = "n  ole n he round here ived  obbit. ot  asty, irty, et ole, illed ith he nds f orms nd n zy mell, or et  ry, are, andy ole ith othig n t o it own n r o at: t as  obbit-ole, nd ha eans omfort.\n" +
                "t ad  erfectly ound oor ike  orthole, ainted reen, ith  hiny ellow rass nob n he xact iddle. he oor pened n o  ube-shaped all ike  unnel:  ery omfortable unnel ithout moke, ith anelled alls, nd loors iled nd arpeted, rovided ith olished hairs, nd ots nd ots f egs or ats nd oats—he obbit as ond f isitors. he unnel ound n nd n, oin airly ut ot uite traight nto he ide f he ill—he ill, s ll he eole or any iles ound alled t—nd any itte ound oors pened ut f t, irst n ne ide nd hen n nother. o oin pstairs or he obbit: edrooms, athrooms, ellars, antries (ots f hese), ardrobes (e ad hole ooms evote o lothes), itchens, ining-rooms, ll ere n he ame loor, nd ndeed n he ame assage. he est ooms ere ll n he eft-hand ide (oin n), or hese ere he nly nes o ave indos, eep-set ound indos ooking ver is arden, nd eadows eyond, loping own o he ive.\n" +
                "his obbit as  ery ell-to-do obbit, nd is ame as aggins. he agginses ad ived n he eighbourhood f he ill or ime ut f ind, nd eole onsidered hem ery espectable, ot nly ecause ost f hem ere ich, ut lso ecause hey ever ad ny dventures r i nything nexpected: ou ould ell hat  aggins ould ay n ny uestion ithout he other f sking im. his s  tory f ow  aggins ad n dventure, nd ound imself oing nd aying hings ltogether nexpected. e ay ave ost he eighbours’ espect, ut e ained—ell, ou ill ee hether e ained nything n he nd";
        assertEquals(expected, result);
    }

    @Test
    public void testTask16() {
        String result = StuffForTasks.task16("/home/matsishin/Desktop/TextWorker/src/main/java/text/partOfHobbit", 4, "_!_");
        String expected = "In a _!_ in the ground there lived a hobbit. Not a nasty, dirty, wet _!_, filled _!_ the _!_ of worms and an _!_ smell, nor yet a dry, _!_, sandy _!_ _!_ nothing in it to sit _!_ on or to eat: it was a hobbit-hole, and _!_ means comfort.\n" +
                "It had a perfectly round _!_ _!_ a porthole, painted green, _!_ a shiny yellow brass _!_ in the exact middle. The _!_ opened on to a tube-shaped _!_ _!_ a tunnel: a _!_ comfortable tunnel without smoke, _!_ panelled walls, and floors tiled and carpeted, provided _!_ polished chairs, and _!_ and _!_ of _!_ for _!_ and coats—the hobbit was _!_ of visitors. The tunnel wound on and on, going fairly but not quite straight _!_ the _!_ of the _!_—The _!_, as all the people for _!_ miles round called it—and _!_ little round doors opened out of it, first on one _!_ and _!_ on another. No going upstairs for the hobbit: bedrooms, bathrooms, cellars, pantries (_!_ of these), wardrobes (he had whole rooms devoted to clothes), kitchens, dining-rooms, all _!_ on the _!_ floor, and indeed on the _!_ passage. The _!_ rooms _!_ all on the left-hand _!_ (going in), for these _!_ the _!_ _!_ to _!_ windows, deep-set round windows looking _!_ his garden, and meadows beyond, sloping _!_ to the river.\n" +
                "_!_ hobbit was a _!_ well-to-do hobbit, and his _!_ was Baggins. The Bagginses had lived in the neighbourhood of The _!_ for _!_ out of _!_, and people considered _!_ _!_ respectable, not _!_ because _!_ of _!_ _!_ _!_, but _!_ because _!_ never had any adventures or did anything unexpected: you could _!_ _!_ a Baggins would say on any question without the bother of asking him. _!_ is a story of how a Baggins had an adventure, and found himself doing and saying things altogether unexpected. He may _!_ _!_ the neighbours’ respect, but he gained—_!_, you _!_ see whether he gained anything in the end.";
        assertEquals(expected, result);
//        System.out.println(result);
    }
}