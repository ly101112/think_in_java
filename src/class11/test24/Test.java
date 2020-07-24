/**
 * 第十一章练习24
 */
package class11.test24;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> si = new LinkedHashMap<>();
        si.put("eee", 10);
        si.put("ccc", 5);
        si.put("fff", 1);
        si.put("aaa", 20);
        si.put("ddd", 15);
        System.out.println(": " + si);
        LinkedHashMap<String, Integer> copy = new LinkedHashMap<>(si);
        System.out.println("copy: " + copy);
        TreeSet<String> keys = new TreeSet<>(copy.keySet());
        System.out.println("key: " + keys);

        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            si.remove(next);
            si.put(next, copy.get(next));
        }

        System.out.println("sorted: " + si);
        System.out.println("copy: " + copy);
    }
}
