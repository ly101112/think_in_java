/**
 * 第十一章练习9 修改第十章练习3，用迭代器替换Selector
 */
package class11.test9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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

    public Sequence() {
    }

    public void add(Object x) {
            items.add(x);
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Iterator iterator = sequence.items.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        Collections.reverse(sequence.items); // 集合倒序
        Iterator iterator1 = sequence.items.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next() + " ");
        }

        Words aaaaa = new Words("aaaaa");
        Words bbbb = new Words("bbbb");
        Words cccc = new Words("cccc");
        Sequence sequence1 = new Sequence();
        sequence1.add(aaaaa);
        sequence1.add(bbbb);
        sequence1.add(cccc);
        Iterator iterator2 = sequence1.items.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next() + " ");
        }
    }
}
