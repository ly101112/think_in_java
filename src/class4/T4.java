package class4;

import java.util.Random;

/**
 * 第四章 控制执行流程
 */
public class T4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        /**
         * 25次随机数对比
         */
        int x = 0;
        Random random = new Random(99);
        for (int i = 0; i < 25; i++) {
            int y = random.nextInt(100);
            if (x > y) {
                System.out.printf("大于 x: %d, y: %d\n", x, y);
            } else if (x < y) {
                System.out.printf("小于 x: %d, y: %d\n", x, y);
            } else {
                System.out.printf("等于 x: %d, y: %d\n", x, y);
            }
            x = y;
        }

        /**
         * 无限对比
         */
//        while (true) {
//            int y = random.nextInt(100);
//            if (x > y) {
//                System.out.printf("大于 x: %d, y: %d\n", x, y);
//            } else if (x < y) {
//                System.out.printf("小于 x: %d, y: %d\n", x, y);
//            } else {
//                System.out.printf("等于 x: %d, y: %d\n", x, y);
//            }
//            x = y;
//        }

        /**
         * 双for水仙花数
         */
        for (int i = 1; i < 100; i++) {
            int times = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    times++;
                }
            }
            if (times == 2) {
                System.out.println(i);
            }
        }

        /**
         * 用三元操作和按位操作符显示二进制
         */
        int a = 0xAAAA;
        int b = 0x5555;
        int c;
        c = a & b;
        outCBit(c);
        c = a | b;
        outCBit(c);
        c = ~a;
        outCBit(c);
        c = a ^ b;
        outCBit(c);
//        版权声明：本文为CSDN博主「歪歪许」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
//        原文链接：https://blog.csdn.net/qq_35396447/java/article/details/52149960

        /**
         * return
         */
        System.out.println(testVal(20, 30, 1, 99));

        /**
         * break && continue
         */
        for (int i = 0; i < 1000; i++) {
            if (i > 100) {
//                return;
                break;
            }
            System.out.println(i);
        }

        /**
         * switch
         */
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println(0);
                case 1:
                    System.out.println(1);
                case 2:
                    System.out.println(2);
            }
        }

        fibonacci(9);

        /**
         * 吸血鬼数字
         */
        String[] arStr1 = null, arStr2;
        int sum = 0;
        int count = 0;
        for (int i = 10; i < 100; i++) {
            for (int j = i + 1; j < 100; j++) {
                int iVal = i * j;
                if (iVal < 1000 || iVal > 9999)
                    continue; // 积小于1000或大于9999排除,继续下一轮环
                count++;
                // 转数组排序后对比是否相等
                arStr1 = String.valueOf(iVal).split("");
                arStr2 = (String.valueOf(i) + String.valueOf(j)).split("");
                java.util.Arrays.sort(arStr1);
                java.util.Arrays.sort(arStr2);
                if (java.util.Arrays.equals(arStr1, arStr2)) {
                    // 排序后比较,为真则找到一组
                    sum++;
                    System.out.println("第" + sum + "组: " + i + "*" + j + "=" + iVal);
                }
            }
        }
        System.out.println("共找到" + sum + "组吸血鬼数" + "\ncount" + count);
    }

    /**
     * 显示二进制，无符号右移，用首位的1逐位或运算，因为为0|1=1,1|1=1，所以运算前后相等（对位相同），
     * 则当前位与1相等
     *
     * @param c
     */
    static void outCBit(int c) {
        int d = 0x8000;
//        System.out.printf("输入： %s， 对比： %s\n", Integer.toBinaryString(c), Integer.toBinaryString(d));
        for (int i = 0; i < 16; i++) {
//            System.out.printf("--输入： %s， 对比： %s, 或运算： %s\n", Integer.toBinaryString(c), Integer.toBinaryString(d),
//                    Integer.toBinaryString(c | d));
            int out = (c | d) == c ? 1 : 0;//循环比较得出每一位
            System.out.print(out);
            d >>>= 1;
        }
        System.out.println();
    }

    /**
     * 判断
     *
     * @param val1
     * @param val2
     * @param begin
     * @param end
     * @return
     */
    static int testVal(int val1, int val2, int begin, int end) {
        if (val1 < begin && val2 > end) {
            return -2;
        }
        if (val1 > val2) {
            return 1;
        } else if (val1 < val2) {
            return -1;
        }
        return 0;
    }

    /**
     * 斐波那契数列
     *
     * @param count
     */
    static void fibonacci(int count) {
        int before1 = 1;
        int before = 1;
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            switch (i) {
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(1);
                    break;
                default:
                    sum = before1 + before;
                    System.out.println(sum);
                    before1 = before;
                    before = sum;
            }
        }
    }
}
