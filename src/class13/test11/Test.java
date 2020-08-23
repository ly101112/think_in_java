/**
 * 第十三章练习11
 */
package class13.test11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    private static String s = "Arline ate eight apples and one orange while anita hadn't any";

    private static String reg = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";

    public static void main(String[] args) {
        System.out.println(s.matches(reg));

        Pattern compile = Pattern.compile(reg);
        Matcher matcher = compile.matcher(s);
        System.out.println(matcher.lookingAt());
        System.out.println(matcher.start() + "-" + matcher.end());
    }
}
