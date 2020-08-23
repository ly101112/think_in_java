/**
 * 第十三章练习10
 */
package class13.test10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    private static final String s = "Java now has regular expressions";

    private static final String[] reg = new String[]{"^Java", "\\Breg*", "n.w\\s+h(a|i)s", "s?",
            "s*", "s+", "s{4}", "s{1}", "s{0,3}"};

    public static void main(String[] args) {
        for (String pattern : reg) {
            Pattern compile = Pattern.compile(pattern);
            Matcher matcher = compile.matcher(s);
            if (matcher.lookingAt())
                System.out.println(pattern + " at " + matcher.start() + "-" + matcher.end());
        }
    }
}
