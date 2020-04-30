/**
 * 第九章练习5 实现接口
 */
package class9.test5;

import class9.test5.annex.In1;

public class Test implements In1 {
    @Override
    public void e() {
        System.out.println("Test.e");
    }

    @Override
    public void d() {
        System.out.println("Test.d");

    }

    @Override
    public void c() {
        System.out.println("Test.c");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.c();
        test.d();
        test.e();
    }
}
