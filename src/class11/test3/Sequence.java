/**
 * 第十一章练习3 修改第十章练习22，取消size限制
 */
package class11.test3;

import java.util.ArrayList;

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
    private ArrayList items = new ArrayList<>();
    private int next = 0;

    public Sequence() {
    }

    public void add(Object x) {
            items.add(x);
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i >= items.size();
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            if (i < items.size())
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
        private int i = items.size() - 1;

        @Override
        public boolean end() {
            return i < 0;
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            if (i < items.size())
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
        Sequence sequence = new Sequence();
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
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
        Sequence sequence1 = new Sequence();
        sequence1.add(aaaaa);
        sequence1.add(bbbb);
        sequence1.add(cccc);
        Selector selector1 = sequence1.selector();
        while (!selector1.end()) {
            System.out.println(selector1.current() + " ");
            selector1.next();
        }

        // 内部类返回外部类的引用  .this的使用
        Sequence sequence2 = new Sequence();
        Selector selector2 = sequence2.selector();
        ((SequenceSelector) selector2).getOuter().add(new Words("test"));
        while (!selector2.end()) {
            System.out.println(selector2.current());
            selector2.next();
        }
    }
}
