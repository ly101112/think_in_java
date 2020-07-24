/**
 * 第十一章练习4 容器
 */
package class11.test4;

import java.util.*;

class Generator {
    private static int key = 0;

    public String next() {
        switch (key) {
            case 0:
                key++;
                return "生化危机";
            case 1:
                key++;
                return "流浪地球";
            case 2:
                key++;
                return "三体";
            case 3:
                key++;
                return "简爱";
            case 4:
                key++;
                return "战狼";
            case 5:
                key = 0;
                return "星际迷航";
            default:
                return "";
        }
    }

    public void fill(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = next();
        }
    }

    public Collection fill(Collection<String> collection, int x) {
        for (int i = 0; i < x; i++) {
            collection.add(next());
        }
        return collection;
    }
}

public class Test {
    public static void main(String[] args) {
        Generator generator = new Generator();
        String[] strings = new String[10];
        generator.fill(strings);
        for (String s: strings) {
            System.out.printf(s + ", ");
        }
        System.out.println();
        System.out.println(generator.fill(new ArrayList<>(), 10));
        System.out.println(generator.fill(new LinkedList<>(), 10));
        System.out.println(generator.fill(new HashSet<>(), 10));
        System.out.println(generator.fill(new LinkedHashSet<>(), 10));
        System.out.println(generator.fill(new TreeSet<>(), 10));
    }
}
