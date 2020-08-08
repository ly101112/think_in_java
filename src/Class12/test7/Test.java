/**
 * 第十二章练习7 修改第十二章练习3 越界异常，catch可以记录日志
 */
package Class12.test7;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
        Integer[] integers = new Integer[5];
        try {
            System.out.println(integers[5]);
        } catch (Exception e) {
            Logger logger = Logger.getLogger("ArrayIndexOutOfBoundsException");
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            logger.severe(stringWriter.toString());
        }
    }
}
