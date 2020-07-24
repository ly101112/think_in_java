/**
 * 第十一章练习14 LinkedList
 */
package class11.test14;

import java.util.LinkedList;
import java.util.ListIterator;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        Integer[] intArr = {20, 9, 8, 5, 6};
        for (int i : intArr) {
            System.out.println("size: " + integers.size() + " / 2: " + integers.size() / 2);
            ListIterator<Integer> il = integers.listIterator(integers.size() / 2);
            il.add(i);
            System.out.println("previous: " + il.previousIndex() + " next: " + il.nextIndex());
            System.out.println("integers: " + integers + " i: " + i);
        }
    }
}
