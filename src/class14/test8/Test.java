/**
 * 第十四章练习8
 */
package class14.test8;

class A {}
class B extends A {}
class C extends B {}

public class Test {
    static void print(Object obj) {
        if (obj.getClass().getSuperclass() != null) {
            System.out.println(obj.getClass().getSuperclass());
            try {
                print(obj.getClass().getSuperclass().newInstance());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        print(new C());
    }
}
