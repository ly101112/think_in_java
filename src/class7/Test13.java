/**
 * 第七章练习13 重载也会继承
 */
package class7;

class Test13A {
    void p(int x) {
        System.out.println("p(int x)");
    }

    void p(float x) {
        System.out.println("p(float x)");
    }

    void p(char x) {
        System.out.println("p(char x)");
    }
}

public class Test13 extends Test13A {
    void p(String x) {
        System.out.println("p(String x)");
    }

    public static void main(String[] args) {
        Test13 test13 = new Test13();
        test13.p(1);
        test13.p('a');
        test13.p(1F);
        test13.p("asd");
    }
}
