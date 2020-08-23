/**
 * 第十三章练习13
 */
package class13.test13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd {
    public static String input = "Twas brillig, and the slithy toves\n" +
            "Did gyre and gimble in the wabe.\n" +
            "All mimsy were the borogoves,\n" +
            "And the mome raths outgrabe.\n\n" +
            "Beware the Jabberwock, my son,\n" +
            "The jaws that bite, the claws that catch.\n" +
            "Beware the Jubjub bird, and shun\n" +
            "The frumious Bandersnatch.";

    private static class Display {
        private boolean regexPrinted = false;
        private String regex;

        Display(String regex) {
            this.regex = regex;
        }

        void display(String message) {
            if (!regexPrinted) {
                System.out.println(regex);
                regexPrinted = true;
            }
            System.out.println(message);
        }
    }

    static void examine(String s, String regex) {
        Display display = new Display(regex);
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(s);
        while (matcher.find())
            display.display("find() '" + matcher.group() +
                    "' start = " + matcher.start() + " end = " + matcher.end());
        if (matcher.lookingAt())
            display.display("lookingAt() start = " + matcher.start() + " end = " + matcher.end());
        if (matcher.matches())
            display.display("matches() start = " + matcher.start() + " end = " + matcher.end());
    }

    public static void main(String[] args) {
        for (String in : input.split("\n")) {
            System.out.println("input: " + in);
            for (String regex : new String[]{"[\\w\\s]*"}) {
                examine(in, regex);
            }
        }
    }
}
