/**
 * 第十一章练习11 通用的迭代器
 */
package class11.test11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyIterator {
    public void each(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("aaa", "bbb", "ccc", "ddd"));
        ArrayList<Float> floats = new ArrayList<>(Arrays.asList(0.1F, 1.2F, 2.5F, 4.8F));
        ArrayList<Double> doubles = new ArrayList<>(Arrays.asList(2D, 7D, 0.5D, 8D));

        MyIterator myIterator = new MyIterator();
        myIterator.each(integers);
        myIterator.each(strings);
        myIterator.each(floats);
        myIterator.each(doubles);
    }
}
