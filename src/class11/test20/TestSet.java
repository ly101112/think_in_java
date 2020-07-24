/**
 * 第十一章练习20 修改第十一章练习16 追踪每个元音出现的次数
 */
package class11.test20;

import java.util.*;

public class TestSet {

    public void count(Set<String> sSet) {
        TreeSet<Character> ss = new TreeSet<Character>();
        Collections.addAll(ss, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        HashMap<Character, Integer> chm = new HashMap<>();

        int vowelsCount = 0;
        for (String s: sSet) {
            int count = 0;
            for (Character c : s.toCharArray()) {
                System.out.println("c: " + c);
                if (ss.contains(c)) {
                    count++;
                    vowelsCount++;
                    Integer integer = chm.get(c);
                    System.out.println("integer: " + integer);
                    chm.put(c, integer == null ? 1 : ++integer);
                }
            }
            System.out.println(s + " count " + count);
        }
        System.out.println("total: " + vowelsCount);
        System.out.println("vowels: " + chm);
    }

    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        Collections.addAll(strings, "words", "eye", "just", "apple");

        TestSet testSet = new TestSet();
        testSet.count(strings);
    }

}
