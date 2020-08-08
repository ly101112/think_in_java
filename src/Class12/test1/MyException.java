/**
 * 第十二章练习1 自定义异常
 */
package Class12.test1;

class MyThrowException extends Exception {
    public MyThrowException() {
        super();
    }

    public MyThrowException(String message) {
        super(message);
    }
}

public class MyException {
    public void test() throws MyThrowException {
        System.out.println("MyThrowException from test()");
        throw new MyThrowException();
    }

    public void testMsg() throws MyThrowException {
        System.out.println("MyThrowException from testMsg()");
        throw  new MyThrowException("origin in testMsg()");
    }

    public static void main(String[] args) {
        MyException myException = new MyException();
        try {
            myException.test();
        } catch (MyThrowException e) {
            e.printStackTrace(System.out);
        }
        try {
            myException.testMsg();
        } catch (MyThrowException e) {
            e.printStackTrace(System.out);
        } finally {
            System.out.println("finally is running");
        }
    }
}
