/**
 * 第十一章练习25
 */
package class11.test25;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        LinkedHashMap<String, ArrayList<Integer>> m = new LinkedHashMap<String, ArrayList<Integer>>();
        LinkedList<String> words = new LinkedList<String>();
        words.addAll(Arrays.asList("test", "java", "abc", "php", "go", "nodejs", "test"));
        System.out.println("words: " + words);
        Iterator it = words.iterator();
        int count = 0;
        while (it.hasNext()) {
            String s = (String) it.next();
            count++;
            if (!m.keySet().contains(s)) {
                ArrayList<Integer> ai = new ArrayList<Integer>();
                ai.add(count);
                m.put(s, ai);
            } else {
                m.get(s).add(count);
                m.put(s, m.get(s));
            }
        }
        System.out.println("words locations: " + m);
    }
}
