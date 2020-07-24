/**
 * 第十一章练习12 listIterator
 */
package class11.test12;

import java.util.*;

public class MyList {
    public static void main(String[] args) {
        List<Integer> integer1 = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4));
        List<Integer> integer2 = new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8, 9));
        System.out.println("int1: " + integer1);
        System.out.println("int2: " + integer2);

        ListIterator<Integer> li1 = integer1.listIterator(integer1.size());
        ListIterator<Integer> li2 = integer2.listIterator();

        while (li2.hasNext()) {
            Integer next = li2.next();
            Integer previous = li1.previous();
            System.out.println("li2.next: " + next);
            System.out.println("li1.previous: " + previous);
            li2.set(previous);
        }

        System.out.println("int1: " + integer1);
        System.out.println("int2: " + integer2);

    }
}
