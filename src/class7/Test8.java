/**
 * 第七章练习8
 */
package class7;

class Test8A{
    Test8A(int i) {
        System.out.println("Test8A constructor");
    }
}

public class Test8 extends Test8A {
    Test8() {
        super(1);
        System.out.println("Test8 default constructor");
    }
    Test8(int i) {
        super(i);
        System.out.println("Test8 constructor");
    }

    public static void main(String[] args) {
        Test8 test8 = new Test8();
        Test8 test81 = new Test8(11);
    }
}
