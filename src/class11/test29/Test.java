/**
 * 第十一章练习29
 */
package class11.test29;

import java.util.PriorityQueue;

class Simple extends Object {}

public class Test {
    public static void main(String[] args) {
        PriorityQueue<Simple> simples = new PriorityQueue<>();
        for (int i = 0; i < 5; i++) {
            // 不能添加，会报错
            // Exception in thread "main" java.lang.ClassCastException: class11.test29.Simple cannot be cast to java.lang.Comparable
            simples.offer(new Simple());
        }
    }
}
