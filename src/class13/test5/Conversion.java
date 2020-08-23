/**
 * 第十三章练习5
 */
package class13.test5;

import java.math.BigInteger;
import java.util.Formatter;

public class Conversion {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.out);

        char u = 'a';
        System.out.println("char u = 'a'");
        formatter.format("%-2s%-2S%-2c%-2C%-5b%-5B%-3h%-3H%%\n", u, u, u, u, u, u, u, u);

        int v = 121;
        System.out.println("int v = 121");
        formatter.format("%-4s%-4S%-4d%-4c%-4C%-5b%-5B%-4x%-4X%-4h%-4H%%\n", v, v, v, v, v, v, v, v, v, v, v);

        BigInteger w = new BigInteger("50000000000000");
        System.out.println("BigInteger w = 50000000000000");
        formatter.format("%-15s%-15S%-5b%-5B%-15x%-15X%-5h%-5H%%\n", w, w, w, w, w, w, w, w);

        double x = 179.543;
        System.out.println("double x = 179.543");
        formatter.format("%-8s%-8S%-5b%-5B%-15f%-15e%-15E%-12h%-12H%%\n", x, x, x, x, x, x, x, x, x);

        Conversion y = new Conversion();
        System.out.println("Conversion y = new Conversion()");
        formatter.format("%-20s%-20S%-5b%-5B%-10h%-10H%%\n", y, y, y, y, y, y);

        boolean z = false;
        System.out.println("boolean z = false");
        formatter.format("%-7s%-7S%-7b%-7B%-7h%-7H%%\n", z, z, z, z, z, z);
    }
}
