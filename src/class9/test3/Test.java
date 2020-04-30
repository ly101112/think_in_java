/**
 * 第九章练习3 父类的抽象方法会被子类的重写方法覆盖
 */
package class9.test3;

abstract class Base {
    Base() {
        print();
    }

    abstract void print();
}

class Ex1 extends Base {
    private int x = 1;

    @Override
    void print() {
        System.out.println("Ex1.x = " + x);
    }
}

public class Test {
    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        ex1.print();
    }
}
