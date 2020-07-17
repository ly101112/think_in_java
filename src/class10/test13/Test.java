/**
 * 第十章练习13 在方法里的匿名内部类
 */
package class10.test13;

interface Test13 {
    void f();
}

public class Test {
    public Test13 test() {
        return new Test13() {
            {
                System.out.println("new " + getClass().getSimpleName());
            }

            @Override
            public void f() {
                System.out.println(getClass().getSimpleName() + ".f");
            }
        };
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.test().f();
    }
}
