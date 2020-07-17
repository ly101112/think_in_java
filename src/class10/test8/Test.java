/**
 * 第十章练习8 外部类访问内部类的私有元素
 */
package class10.test8;

public class Test {
    class Inner {
        private int a = 1;
        private int b = 2;
        private void showB() { System.out.println(b); }
    }
    int oi = new Inner().a;
    void showA() { System.out.println(oi); }
    void showB() { new Inner().showB(); }

    public static void main(String[] args) {
        Test out = new Test();
        out.showA();
        out.showB();
    }
}
