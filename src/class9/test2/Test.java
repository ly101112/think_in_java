/**
 * 第九章练习2 验证没有任何抽象方法的抽象类能不能船舰实例
 */
package class9.test2;

abstract class A {
}

abstract class B {
    void call() {
        System.out.println("B.call()");
    }
}

class C extends B {
    @Override
    void call() {
        System.out.println("C.call()");
    }
}

public class Test {
    public static void main(String[] args) {
//        A a = new A(); // 抽象类不能实例化
//        B b = new B();
        C c = new C();
        c.call();
    }
}
