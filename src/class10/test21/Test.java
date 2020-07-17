/**
 * 第十章练习21 接口里的嵌套类
 */
package class10.test21;

public interface Test {
    void p();

    class TestClass implements Test {
        @Override
        public void p() {
            System.out.println(getClass().getSimpleName());
        }

        static void getTest(TestClass testClass) {
            testClass.p();
        }

        public static void main(String[] args) {
            getTest(new TestClass());
        }
    }
}
