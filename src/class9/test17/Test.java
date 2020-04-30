/**
 * 第九章练习17 验证接口中的域是自动static final的
 */
package class9.test17;

interface Day {
    int MONDAY = 1, TUESDAY = 2, WEDNESDAY = 3, THURSDAY = 4, FRIDAY = 5, SATURDAY = 6, SUNDAY = 7;
}

public class Test {
    public static void main(String[] args) {
        System.out.println("monday = " + Day.MONDAY);
    }
}
