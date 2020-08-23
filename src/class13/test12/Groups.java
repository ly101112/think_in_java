/**
 * 第十三章练习12
 */
package class13.test12;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    public static final String POEM = "Twas brillig, and the slithy toves\n" +
            "Did gyre and gimble in the wabe.\n" +
            "All mimsy were the borogoves,\n" +
            "And the mome raths outgrabe.\n\n" +
            "Beware the Jabberwock, my son,\n" +
            "The jaws that bite, the claws that catch.\n" +
            "Beware the Jubjub bird, and shun\n" +
            "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Matcher matcher = Pattern.compile("(^[a-z]|\\s+[a-z])\\w+").matcher(POEM);
        HashSet<String> strings = new HashSet<>();
        while (matcher.find()) {
            strings.add(matcher.group());
        }

        System.out.println(strings.size());
        System.out.println(strings);
    }
}
