/**
 * 第十三章练习6
 */
package class13.test6;

public class Test {
    private int i;
    private long l;
    private float f;
    private double d;

    @Override
    public String toString() {
        return String.format("i = %-5d, l = %-5d, f = %-10.2f, d = %-10.4f", i, l, f, d);
    }

    public Test(int i, long l, float f, double d) {
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
    }

    public static void main(String[] args) {
        Test test = new Test(1, 10000L, 0.5f, 0.00006d);
        System.out.println(test);
    }
}
