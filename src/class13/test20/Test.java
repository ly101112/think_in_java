/**
 * 第十三章练习20
 */
package class13.test20;

import java.util.Scanner;

public class Test {
    private int i;
    private long l;
    private float f;
    private double d;
    private String s;

    public Test(String input) {
        Scanner scanner = new Scanner(input);
        i = scanner.nextInt();
        l = scanner.nextLong();
        f = scanner.nextFloat();
        d = scanner.nextDouble();
        s = scanner.next();
    }

    @Override
    public String toString() {
        return "i = " + i + " l = " + l + " f = " + f + " d = " + d + "\ns = " + s;
    }

    public static void main(String[] args) {
        Test test = new Test("10 567890 20.1 20.3015124 aaa");
        System.out.println(test);
    }
}
