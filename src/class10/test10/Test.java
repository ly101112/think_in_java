/**
 * 第十章练习10 在方法的作用域里的内部类
 */
package class10.test10;

interface Test9 {
    void f();
}

public class Test {
    public Test9 test(boolean a) {
        if (a) {
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

        return null;
    }

    public static void main(String[] args) {
        Test test = new Test();
        Test9 test1 = test.test(true);
    }
}
