package text;

class Punctuation {
    private static final String regex = "[\\t]|(( ){2,})|(( ){2,})";

    static String replaceTabs(String content) {
        return content.replaceAll(regex," ");
        }
    }
