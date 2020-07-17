/**
 * 第十章练习5 在独立类中创建一个类的内部类实例
 */
package class10.test5;

class Outer1 {
    class Inner1 {
        public Inner1() {
            System.out.println("Outer1.Inner1");
        }
    }
}

public class Outer2 {
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        Outer1.Inner1 inner1 = outer1.new Inner1();
    }
}
