/**
 * 第十章练习26 内部类得继承
 */
package class10.test26;

class WithInner {
    class Inner {
        public Inner(int x) {
        }
    }
}

public class Test extends WithInner {

    // 外部类继承内部类的外部类才能继承内部类
    class Inner extends WithInner.Inner {
        public Inner(int x) {
            super(x);
        }
    }

    public static void main(String[] args) {
    }
}
