/**
 * 第十一章练习23
 */
package class11.test23;

import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

public class Statistics {

    public int getMaxTimesNum(int n) {
        Random random = new Random();
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int i1 = random.nextInt(20);
            Integer integer = integerIntegerHashMap.get(i1);
            integerIntegerHashMap.put(i1, integer == null ? 1 : ++integer);
        }
//        System.out.println("integerIntegerHashMap: " + integerIntegerHashMap);
        int max = 0;
        int maxKey = 0;
        for (int i = 0; i < integerIntegerHashMap.keySet().size(); i++) {
            if (max < integerIntegerHashMap.get(i)) {
                max = integerIntegerHashMap.get(i);
                maxKey = i;
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        TreeMap<Integer, Integer> integerIntegerTreeMap = new TreeMap<>();
        Statistics statistics = new Statistics();
        for (int i = 0; i < 2000; i++) {
            int maxTimesNum = statistics.getMaxTimesNum(10000);
            Integer integer = integerIntegerTreeMap.get(maxTimesNum);
            integerIntegerTreeMap.put(maxTimesNum, integer == null ? 1 : ++integer);
        }
        System.out.println("最大出现次数的数： " + integerIntegerTreeMap);
    }
}
