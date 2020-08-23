/**
 * 第十三章练习19
 */
package class13.test19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        if (!args[0].matches("\\w+\\.java")) {
            System.out.println("Usage: java file");
            System.exit(0);
        }

        Pattern compile = Pattern.compile("(class \\w+)");
        Matcher matcher = compile.matcher("");

        for (String line : new TextFile(args[0])) {
            matcher.reset(line);
            if (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}
