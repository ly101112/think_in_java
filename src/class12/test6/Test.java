/**
 * 第十二章练习6
 */
package class12.test6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class MyException1 extends Exception {
    private static Logger logger = Logger.getLogger("MyException1");

    public MyException1() {
        StringWriter stringWriter = new StringWriter();
        printStackTrace(new PrintWriter(stringWriter));
        logger.severe(stringWriter.toString());
    }
}

class MyException2 extends Exception {
    private static Logger logger = Logger.getLogger("MyException2");

    public MyException2() {
        StringWriter stringWriter = new StringWriter();
        printStackTrace(new PrintWriter(stringWriter));
        logger.severe(stringWriter.toString());
    }
}

public class Test {

    public void msg1() throws MyException1 {
        throw new MyException1();
    }

    public void msg2() throws MyException2 {
        throw new MyException2();
    }

    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.msg1();
        } catch (MyException1 myException1) {
        }

        try {
            test.msg2();
        } catch (MyException2 exception2) {
            
        }
    }
}
