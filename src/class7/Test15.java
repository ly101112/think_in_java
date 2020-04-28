/**
 * 第七章练习15
 */
package class7;

class Test15A {
    protected void f() {
        System.out.println("protected");
    }
}

public class Test15 extends Test15A {
    protected void f() {
        System.out.println("Test15 protected");
    }

    public static void main(String[] args) {
        Test15 test15 = new Test15();
        test15.f();
    }
}
