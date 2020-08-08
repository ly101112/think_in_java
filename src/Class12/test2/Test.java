/**
 * 第十二章练习2 空指针异常
 */
package Class12.test2;

public class Test {
    public void msg() {
        System.out.println("aaa");
    }

    public static void main(String[] args) {
        Test test = null;
        try {
            test.msg();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
