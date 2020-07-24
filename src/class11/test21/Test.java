/**
 * 第十一章练习21
 */
package class11.test21;

import java.util.*;

public class Test {

    public void sort(List<String> ss) {
        Collections.sort(ss, String.CASE_INSENSITIVE_ORDER);
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        ListIterator<String> stringListIterator = ss.listIterator();
        while (stringListIterator.hasNext()) {
            String next = stringListIterator.next();
            Integer integer = stringIntegerHashMap.get(next);
            stringIntegerHashMap.put(next, integer == null ? 1 : ++integer);
        }
        System.out.println("words: " + stringIntegerHashMap);
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "word", "love", "live", "live", "yes");
        Test test = new Test();
        test.sort(strings);
    }
}
