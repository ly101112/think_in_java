/**
 * 第十章练习11 私有内部类的使用
 */
package class10.test11;

class Test1 {
    private class Inner implements In{
        public Inner() {
            System.out.println("new " + getClass().getSimpleName());
        }

        @Override
        public void f(String s) {
            System.out.println(getClass().getSimpleName() + " " + s);
        }
    }

    public In getInner() {
        return new Inner();
    }
}

public class Test {
    public static void main(String[] args) {
        Test1 test = new Test1();
        test.getInner().f("test");
        // 找不到Inner类 不能向下转型
//         ((Inner) test.getInner()).f("hello");
    }
}
