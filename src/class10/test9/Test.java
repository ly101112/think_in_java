/**
 * 第十章练习9 在方法里的内部类
 */
package class10.test9;

interface Test9 {
    void f();
}

public class Test {
    public Test9 test() {
        class Tem implements Test9 {
            public Tem() {
                System.out.println("new " + getClass().getSimpleName());
            }

            @Override
            public void f() {
                System.out.println(getClass().getSimpleName() + ".f");
            }
        }

        return new Tem();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.test().f();
    }
}
