/**
 * 第十二章练习10
 */
package class12.test10;

class MyException1 extends Exception {}

class MyException2 extends Exception {}

public class Test {
    public void g() throws MyException1 {
        System.out.println("exception in g()");
        throw new MyException1();
    }

    public void f() throws MyException2 {
        try {
            g();
        } catch (MyException1 myException1) {
            myException1.printStackTrace(System.out);
            throw new MyException2();
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
