/**
 * 第十二章练习8
 */
package Class12.test8;

class Exception1 extends Exception {
    public Exception1() {
        super();
    }
}

public class Test {
    public void msg() throws Exception1 {
        throw new Exception1();
    }

    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.msg();
        } catch (Exception1 exception1) {
            exception1.printStackTrace();
        }
    }
}
