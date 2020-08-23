/**
 * 第十二章练习4 自定义异常类
 */
package class12.test4;

class MyException extends Exception {
    private String exception;

    public MyException(String message) {
        exception = message;
    }

    public void display() {
        System.out.println("msg: " + exception);
    }
}

public class Test {
    public void msg() throws MyException {
        System.out.println("MyException in msg()");
        throw new MyException("MyException in msg(sss)");
    }

    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.msg();
        } catch (MyException e) {
            e.display();
        }
    }
}
