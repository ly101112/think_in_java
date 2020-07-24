/**
 * 第十一章练习5 list的操作
 */
package class11.test5;

import java.util.*;

public class ListFeature {
    public static void main(String[] args) {
        Random random = new Random(57);
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        System.out.println("1: " + integers);
        integers.add(5);
        System.out.println("2: " + integers);
        System.out.println("3: " + integers.contains(5));
        integers.add(Integer.valueOf(321));
        System.out.println("4: " + integers);
        System.out.println("5: " + integers.contains(Integer.valueOf(321)));
        integers.remove(5);
        integers.remove(Integer.valueOf(321));
        System.out.println("6: " + integers);
        Integer integer = integers.get(2);
        System.out.println("7: " + integer + " index: " + integers.indexOf(integer));
        Integer int1 = 321;
        System.out.println("8: " + integers.indexOf(int1));
        System.out.println("9: " + integers.remove(int1));

        Integer int2 = 3;
        System.out.println("10: " + integers.indexOf(int2));
        System.out.println("11: " + integers.remove(int2));

        System.out.println("12: " + integers.remove(integer));
        System.out.println("13: " + integers);

        integers.add(3, new Integer(22));
        System.out.println("14: " + integers);

        List<Integer> sub = integers.subList(1, 4);
        System.out.println("subList: " + sub);

        System.out.println("15: " + integers.containsAll(sub));

        Collections.sort(sub);
        System.out.println("sorted subList: " + sub);
        // 顺序对于containsAll来说不重要，不参与判断
        System.out.println("16: " + integers.containsAll(sub));

        Collections.shuffle(sub, random); // 随机打乱顺序
        System.out.println("shuffled subList: " + sub);
        System.out.println("17: " + integers.containsAll(sub));

        List<Integer> copy = new ArrayList<>(integers);

        sub = Arrays.asList(integers.get(1), integers.get(4));
        System.out.println("sub: " + sub);

        copy.retainAll(sub);
        System.out.println("18: " + copy);

        copy = new ArrayList<Integer>(integers);
        System.out.println("18.5: " + copy + " ----- " + copy.get(2));
        copy.remove(2);
        System.out.println("19: " + copy);
        copy.removeAll(sub); // 只移除存在的对象
        System.out.println("20: " + copy);
        copy.set(1, 90);
        System.out.println("21: " + copy);
        copy.addAll(2, sub);
        System.out.println("22: " + copy);
        System.out.println("23: " + integers.isEmpty());

        integers.clear();
        System.out.println("24: " + integers);
        System.out.println("25: " + integers.isEmpty());
        integers.addAll(Arrays.asList(new Integer[]{random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt()}));
        Object[] objects = integers.toArray();
        System.out.println("26: " + Arrays.asList(objects));
        System.out.println("26.5: " + objects[3]);
        Integer[] integers1 = integers.toArray(new Integer[0]);
        System.out.println("27: " + Arrays.asList(integers1));
        System.out.println("27.5: " + integers1[3].toString());

    }
}
