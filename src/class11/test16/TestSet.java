/**
 * 第十一章练习16 Set
 */
package class11.test16;

import java.util.*;

public class TestSet {

    public void count(Set<String> sSet) {
        TreeSet<Character> ss = new TreeSet<Character>();
        Collections.addAll(ss, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');

        int vowelsCount = 0;
        for (String s: sSet) {
            int count = 0;
            for (Character c : s.toCharArray()) {
                if (ss.contains(c)) {
                    count++;
                    vowelsCount++;
                }
            }
            System.out.println(s + " count " + count);
        }
        System.out.println("total: " + vowelsCount);
    }

    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        Collections.addAll(strings, "words", "eye", "just", "apple");

        TestSet testSet = new TestSet();
        testSet.count(strings);
    }

}
