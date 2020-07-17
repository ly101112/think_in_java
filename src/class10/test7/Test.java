/**
 * 第十章练习7 内部类的对象对外围类的对象的影响
 */
package class10.test7;

public class Test {
    private int value = 1;

    private void getValue() {
        System.out.println("value = " + value);
    }

    public class Inner {
        public Inner() {
            System.out.println("new " + getClass().getSimpleName());
        }

        public void modifyOutValue(int x) {
            value *= 2 + x;
            getValue();
        }
    }

    public void testInner(int x) {
        Inner inner = new Inner();
        inner.modifyOutValue(x);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.getValue();
        test.testInner(2);
        test.getValue();
    }
}
