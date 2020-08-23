/**
 * 第十三章练习7
 */
package class13.test7;

public class Reg {
    public static void match(String s) {
        System.out.println(s.matches("^[A-Z].*。$"));
    }

    public static void main(String[] args) {
        String s1 = "avb。";
        String s2 = "Avb。";
        match(s1);
        match(s2);
    }
}
