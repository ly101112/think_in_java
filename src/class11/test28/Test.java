/**
 * 第十一章练习28 PriorityQueue 优先队列
 */
package class11.test28;

import java.util.PriorityQueue;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        PriorityQueue<Double> doubles = new PriorityQueue<>();
        for (int i = 0; i < random.nextInt(20); i++) {
            doubles.offer(random.nextDouble() * i);
        }

        while (doubles.peek() != null) {
            System.out.println(doubles.poll());
        }
    }
}
