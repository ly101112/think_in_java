/**
 * 第十章练习18 嵌套类（static 的内部类）
 */
package class10.test18;

public class Test {
    public static class Inner {
        private static int x = 0;

        public int getX() {
            return x;
        }
    }

    public static Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Inner inner = getInner();
        System.out.println(inner.getX());
    }
}
