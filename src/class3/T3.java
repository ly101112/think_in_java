package class3;

import java.util.Random;

/**
 * 第三章 操作符
 */
public class T3 {
    public static void main(String[] args) {
        /**
         * 第一种
         */
        Class1 c1 = new Class1();
        Class1 c2 = new Class1();
        c1.x = 9;
        c2.x = 27;
        System.out.printf("c1: %f, c2: %f\n", c1.x, c2.x);
        c1 = c2;
        System.out.printf("c1: %f, c2: %f\n", c1.x, c2.x);
        c1.x = 50;
        System.out.printf("c1: %f, c2: %f\n", c1.x, c2.x);

        /**
         * 第二种
         */
        Class1 c3 = new Class1();
        c3.x = 100;
        System.out.printf("c3: %f\n", c3.x);
        f(c3);
        System.out.printf("c3: %f\n", c3.x);

        /**
         * 计算
         */
        Speed speed = new Speed();
        speed.time = 10;
        speed.distance = 100;
        double s = speed.getSpeed();
        System.out.printf("speed: %.2f\n", s);

        /**
         * 引用和对比
         */
        Dog d1 = new Dog();
        d1.name = "spot";
        d1.says = "Ruff!";
        d1.bark();
        Dog d2 = new Dog();
        d2.name = "scruffy";
        d2.says = "Wurf!";
        d2.bark();
        Dog d3 = d1;
        System.out.printf("d3 === d1 ? ==: %b, equals: %b\n", d3 == d1, d3.equals(d1));

        /**
         * 抛硬币
         */
        Coin coin = new Coin();
        coin.getResult();

        /**
         * 展示进制
         */
        Integer x8 = 07577;
        Integer x16 = 0Xff1;
        System.out.printf("8进制为： %s， 16进制为：%s\n", Integer.toBinaryString(x8), Integer.toBinaryString(x16));

        /**
         * double和float的最大/小指数值
         */
        System.out.printf("max -- float: " + Float.MAX_VALUE + ", double: " + Double.MAX_VALUE + "\n");
        System.out.printf("min -- float: " + Float.MIN_VALUE + ", double: " + Double.MIN_VALUE + "\n");

        /**
         * 位运算
         */
        int position1 = 0X18;
        int position2 = 0X19;
        System.out.printf("position1：%s, position2: %s\n", Integer.toBinaryString(position1), Integer.toBinaryString(position2));
        System.out.printf("与运算：%s\n", Integer.toBinaryString(position1 &= position2));
        System.out.printf("或运算：%s\n", Integer.toBinaryString(position1 |= position2));
        System.out.printf("异或运算：%s\n", Integer.toBinaryString(position1 ^= position2));

        /**
         * 位移
         */
        int moveHave16 = 0X18;
        while (moveHave16 > 0) {
            moveHave16 >>= 1;
            System.out.printf("==== %s\n", Integer.toBinaryString(moveHave16));
        }

        int moveBoth16 = 0X7;
        moveBoth16 <<= 1;
        System.out.printf("==== %s\n", Integer.toBinaryString(moveBoth16));
        while (moveBoth16 > 0) {
            moveBoth16 >>>= 1;  // 无符号右移，没有无符号左移
            System.out.printf("==== %s\n", Integer.toBinaryString(moveBoth16));
        }

        char2Binary('x');

        compareString("a", "a");
        compareString("asd", "asd");
        compareString("asda", "asd");
    }

    static void f(Class1 x) {
        x.x = 999;
    }

    /**
     * 显示字符类型的二进制字符串
     *
     * @param c 字符
     */
    static void char2Binary(Character c) {
        int x = Integer.valueOf(Character.valueOf(c));
        System.out.printf("==== %s\n", Integer.toBinaryString(x));
    }

    /**
     * 对比字符串的方法对比
     * @param a
     * @param b
     */
    static void compareString(String a, String b) {
        System.out.printf("==: %b, !=: %b\n", a == b, a != b);
        System.out.printf("equals: %b\n", a.equals(b));
    }
}

class Class1 {
    float x;
}

class Speed {
    double time;
    double distance;

    double getSpeed() {
        return this.distance / this.time;
    }
}

class Dog {
    String name;
    String says;

    void bark() {
        System.out.printf("%s barking is %s", this.name, this.says);
    }
}

class Coin {
    void getResult() {
        Random random = new Random(12);
        int x = random.nextInt(100);
        int y = random.nextInt(100);
        System.out.printf("硬币结果为%s!\n", x > y ? "正面" : "反面");
    }
}
