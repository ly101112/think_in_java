/**
 * 第十二章练习11 修改第十二章练习10
 * 抛出的第二个异常改为runtimeException
 */
package Class12.test11;

class MyException1 extends Exception {}

public class Test {
    public void g() throws MyException1 {
        System.out.println("exception in g()");
        throw new MyException1();
    }

    public void f() {
        try {
            g();
        } catch (MyException1 myException1) {
            myException1.printStackTrace(System.out);
            throw new RuntimeException(myException1);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.f();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
