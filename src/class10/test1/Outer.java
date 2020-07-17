/**
 * 第十章练习1 内部类
 */
package class10.test1;

public class Outer {

    class Inner {
        public Inner() {
            System.out.println("new Inner");
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.getInner();
    }
}
