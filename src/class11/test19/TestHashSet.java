/**
 * 第十一章练习19 HashSet和LinkedHashSet
 */
package class11.test19;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet<String> shs = new HashSet<String>();
        Collections.addAll(shs, "ccc", "ttt", "jjj", "ggg", "yyy", "ddd", "eee", "aaa");

        System.out.println(shs);
        System.out.println();
        LinkedHashSet<String> lhs = new LinkedHashSet<String>(new TreeSet<String>(shs));
        System.out.println("sort LinkedHashSet: " + lhs);
    }
}
