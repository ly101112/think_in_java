/**
 * 第七章练习5、7
 */
package class7;

public class Test5 {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c);
        System.out.println(c.b);
    }
}

class A {
    public A(int x) {
        System.out.println(x);
    }
}

class B {
    public B(int y) {
        System.out.println(y);
    }
}

class C extends A {
    public C() {
        super(11);
        System.out.println('c');
    }

    B b = new B(12);
}
