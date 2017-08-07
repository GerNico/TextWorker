package text;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Punctuation {
    public final static String EOS_PATTERN = ".!?";
    public final static String SEL_S_PATTERN = "'\"";

    private static final String regex = "[\\t]|(( ){2,})|(( ){2,})";

    public static String replaceTabs (String content) {
//            Pattern re = Pattern.compile(regex);
//            Matcher reMatcher = re.matcher(content);
            String result=content.replaceAll(regex," ");
            return result;
        }
    }
