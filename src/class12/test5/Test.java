/**
 * 第十二章练习5 恢复模型
 */
package class12.test5;

public class Test {
    private static int[] ints = new int[2];
    private static int x = 5;

    public static void main(String[] args) {
        while (true) {
            try {
                ints[x] = x;
                System.out.println(ints[x]);
                break;
            } catch (IndexOutOfBoundsException e) {
                System.err.println("IndexOutOfBoundsException");
                e.printStackTrace();
                x--;
            } finally {
                System.err.println("完了??");
            }
        }
        System.out.println("完");
    }
}
