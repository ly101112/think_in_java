/**
 * 第十一章练习26 修改第十一章练习25，按照单词最初的顺序重新创建单词排序
 */
package class11.test26;

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

        TreeMap<Integer, String> restore = new TreeMap<>();
        Iterator<Map.Entry<String, ArrayList<Integer>>> iterator = m.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, ArrayList<Integer>> entry = iterator.next();
            System.out.println(entry);
            for (int location : entry.getValue()) {
                restore.put(location, entry.getKey());
            }
        }

        System.out.println("words origin locations: " + restore);
    }
}
