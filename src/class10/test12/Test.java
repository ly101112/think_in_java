/**
 * 第十章练习12 匿名内部类的对象对外围类的对对象的影响
 */
package class10.test12;

interface Inner {
    void modifyOutValue(int x);
}

public class Test {
    private int value = 1;

    private void getValue() {
        System.out.println("value = " + value);
    }

    public Inner testInner() {
        return new Inner() {
            {
                System.out.println("new " + getClass().getSimpleName());
            }

            @Override
            public void modifyOutValue(int x) {
                value *= 2 + x;
            }
        };
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.getValue();
        test.testInner().modifyOutValue(2);
        test.getValue();
    }
}
