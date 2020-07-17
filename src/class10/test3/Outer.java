/**
 * 第十章练习3 修改练习1
 */
package class10.test3;

public class Outer {
    private String s;

    public Outer(String s) {
        this.s = s;
    }

    class Inner {
        public Inner() {
            System.out.println("new Inner");
        }

        @Override
        public String toString() {
            return s;
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer("test");
        Inner inner = outer.getInner();
        System.out.println(inner);
    }
}
