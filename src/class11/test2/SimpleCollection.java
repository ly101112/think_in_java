/**
 * 第十一章练习2 Set
 */
package class11.test2;

import java.util.HashSet;
import java.util.Set;

public class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }

        for (Integer i: c) {
            System.out.printf(i + ", ");
        }
    }
}
