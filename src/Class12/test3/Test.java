/**
 * 第十二章练习3 越界异常
 */
package Class12.test3;

public class Test {
    public static void main(String[] args) {
        Integer[] integers = new Integer[5];
        try {
            System.out.println(integers[5]);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
