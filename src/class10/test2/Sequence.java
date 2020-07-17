/**
 * 第十章练习2 链接到外部类
 */
package class10.test2;

interface Selector {
    boolean end();

    Object current();

    void next();
}

class Words {
    private String word;

    public Words(String s) {
        word = s;
    }

    @Override
    public String toString() {
        return word;
    }
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i >= items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length)
                i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }

        Words aaaaa = new Words("aaaaa");
        Words bbbb = new Words("bbbb");
        Words cccc = new Words("cccc");
        Sequence sequence1 = new Sequence(3);
        sequence1.add(aaaaa);
        sequence1.add(bbbb);
        sequence1.add(cccc);
        Selector selector1 = sequence1.selector();
        while (!selector1.end()) {
            System.out.println(selector1.current() + " ");
            selector1.next();
        }
    }
}
