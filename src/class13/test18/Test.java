/**
 * 第十三章练习18
 */
package class13.test18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        if (!args[0].matches("\\w+\\.java")) {
            System.out.println("Usage: java file");
            System.exit(0);
        }

        Pattern compile = Pattern.compile("(\"[.\\s\\S]+\")");
        Matcher matcher = compile.matcher("");

        for (String line : new TextFile(args[0])) {
            matcher.reset(line);
            if (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}
