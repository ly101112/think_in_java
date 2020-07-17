/**
 * 第十章练习19 内部类里的内部类和嵌套类实现方式的.class文件的区别(没区别。。。。)
 */
package class10.test19;

public class Test {
    private class InnerClass1 {
        public InnerClass1() {
            System.out.println(getClass().getSimpleName());
        }

        private class InnerClass2 {
            public InnerClass2() {
                System.out.println(getClass().getSimpleName());
            }
        }
    }

    private static class NestedClass1 {
        public NestedClass1() {
            System.out.println(getClass().getSimpleName());
        }

        private static class NestedClass2 {
            public NestedClass2() {
                System.out.println(getClass().getSimpleName());
            }
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        InnerClass1 innerClass1 = test.new InnerClass1();
        InnerClass1.InnerClass2 innerClass2 = innerClass1.new InnerClass2();

        NestedClass1 nestedClass1 = new NestedClass1();
        NestedClass1.NestedClass2 nestedClass2 = new NestedClass1.NestedClass2();
    }
}
