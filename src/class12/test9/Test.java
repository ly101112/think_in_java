/**
 * 第十二章练习9
 */
package class12.test9;

import java.util.Random;

class Exception1 extends Exception {}

class Exception2 extends Exception {}

class Exception3 extends Exception {}

public class Test {

    public void msg(int x) throws Exception1, Exception2, Exception3 {
        if (x % 3 == 1) throw new Exception1();
        if (x % 3 == 2) throw new Exception2();
        if (x % 3 == 0) throw new Exception3();
    }

    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.msg(new Random().nextInt(3));
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
