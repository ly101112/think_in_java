/**
 * 参照think in java 的Stack
 */
package class11.test15;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list = new LinkedList<T>();

    public void push(T v) {
        list.addFirst(v);
    }

    public T peek() {
        return list.getFirst();
    }

    public T pop() {
        return list.removeFirst();
    }

    public boolean empty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
