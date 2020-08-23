/**
 * 第十二章练习12 修改第十章练习22 放置过多元素时抛出合适的异常
 */
package class12.test12;

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

    public void add(Object x) throws IndexOutOfBoundsException {
        if (next == items.length)
             throw new IndexOutOfBoundsException();
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

        public Sequence getOuter() {
            return Sequence.this;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    private class ReverseSequenceSelector implements Selector {
        private int i = items.length - 1;

        @Override
        public boolean end() {
            return i < 0;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length)
                i--;
        }

        public Sequence getOuter() {
            return Sequence.this;
        }
    }

    public Selector reverseSelector() {
        return new ReverseSequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        try {
            for (int i = 0; i < 11; i++) {
                sequence.add(Integer.toString(i));
            }
        } catch (IndexOutOfBoundsException  e) {
            e.printStackTrace();
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }

        Selector reverseSelector = sequence.reverseSelector();
        while (!reverseSelector.end()) {
            System.out.println(reverseSelector.current() + " ");
            reverseSelector.next();
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

        // 内部类返回外部类的引用  .this的使用
        Sequence sequence2 = new Sequence(1);
        Selector selector2 = sequence2.selector();
        ((SequenceSelector) selector2).getOuter().add(new Words("test"));
        while (!selector2.end()) {
            System.out.println(selector2.current());
            selector2.next();
        }
    }
}
