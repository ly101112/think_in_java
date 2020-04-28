/**
 * 第八章练习10 重写方法的线上转型的多态示例
 */
package class8.test10;

class Base {
    public void first() {
        second();
    }

    public void second() {
        System.out.println("base second");
    }
}

class One extends Base {
    @Override
    public void second() {
        System.out.println("one second");
    }
}

public class Test10 {
    public static void main(String[] args) {
        Base base = new Base();
        base.first();
        Base one = new One();
        one.first();
    }
}
