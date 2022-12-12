package lesson10;

public final class StringUtilClass {
    public static final String SUFFIX = ".";

    private StringUtilClass() {

    }

    public static String getFirstLetterFromName(String text) {
        if (text.length() > 0) {
            return text.substring(0, 1) + SUFFIX;
        }
        return "";
    }
}
