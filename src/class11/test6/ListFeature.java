/**
 * 第十一章练习6 list的操作
 */
package class11.test6;

import java.util.*;

public class ListFeature {
    public static void main(String[] args) {
        Random random = new Random(57);
        List<String> stringList = new ArrayList<>();
        for (byte s : "abcdefg".getBytes()) {
            stringList.add(String.valueOf((char) s));
        }
        System.out.println("1: " + stringList);
        stringList.add("aaa");
        System.out.println("2: " + stringList);
        System.out.println("3: " + stringList.contains("aaa"));
        stringList.add("ccc");
        System.out.println("4: " + stringList);
        System.out.println("5: " + stringList.contains("ccc"));
        stringList.remove("aaa");
        stringList.remove("ccc");
        System.out.println("6: " + stringList);
        String string = stringList.get(2);
        System.out.println("7: " + string + " index: " + stringList.indexOf(string));
        String str1 = "asvfas";
        System.out.println("8: " + stringList.indexOf(str1));
        System.out.println("9: " + stringList.remove(str1));

        String str2 = "asdasd";
        System.out.println("10: " + stringList.indexOf(str2));
        System.out.println("11: " + stringList.remove(str2));

        System.out.println("12: " + stringList.remove(string));
        System.out.println("13: " + stringList);

        stringList.add(3, new String("dausquwru"));
        System.out.println("14: " + stringList);

        List<String> sub = stringList.subList(1, 4);
        System.out.println("subList: " + sub);

        System.out.println("15: " + stringList.containsAll(sub));

        Collections.sort(sub);
        System.out.println("sorted subList: " + sub);
        // 顺序对于containsAll来说不重要，不参与判断
        System.out.println("16: " + stringList.containsAll(sub));

        Collections.shuffle(sub, random); // 随机打乱顺序
        System.out.println("shuffled subList: " + sub);
        System.out.println("17: " + stringList.containsAll(sub));

        List<String> copy = new ArrayList<>(stringList);

        sub = Arrays.asList(stringList.get(1), stringList.get(4));
        System.out.println("sub: " + sub);

        copy.retainAll(sub);
        System.out.println("18: " + copy);

        copy = new ArrayList<String>(stringList);
        System.out.println("18.5: " + copy + " ----- " + copy.get(2));
        copy.remove(2);
        System.out.println("19: " + copy);
        copy.removeAll(sub); // 只移除存在的对象
        System.out.println("20: " + copy);
        copy.set(1, "8wu[klj");
        System.out.println("21: " + copy);
        copy.addAll(2, sub);
        System.out.println("22: " + copy);
        System.out.println("23: " + stringList.isEmpty());

        stringList.clear();
        System.out.println("24: " + stringList);
        System.out.println("25: " + stringList.isEmpty());
        stringList.addAll(Arrays.asList(new String[]{"poip", "dasjdquw", "adsuidhq", "qweklchzxk"}));
        Object[] objects = stringList.toArray();
        System.out.println("26: " + Arrays.asList(objects));
        System.out.println("26.5: " + objects[3]);
        String[] strings = stringList.toArray(new String[0]);
        System.out.println("27: " + Arrays.asList(strings));
        System.out.println("27.5: " + strings[3]);

    }
}
