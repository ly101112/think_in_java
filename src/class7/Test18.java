package class7;

import java.util.Random;

/**
 * 第七章练习18 final和static final的区别
 */
public class Test18 {
    static final Random random = new Random(99);
    final int x = random.nextInt(100);
    static final int VAL = random.nextInt(20);

    public String toString() {
        return "x: " + x + " VAL: " + VAL;
    }

    public static void main(String[] args) {
        Test18 test18 = new Test18();
        Test18 test181 = new Test18();
        System.out.println(test18);
        System.out.println(test181);
    }
}
