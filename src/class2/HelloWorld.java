package class2;

import java.util.Date;

/**
 * the first learn java program.
 * display a string and today`s date
 *
 * @author y
 * @version think in java 4.0
 */
public class HelloWorld {

    /**
     * entry point to class & application
     *
     * @param args array of string arguments
     * @throws exceptions No exception throw
     */
    public static void main(String[] args) {
        System.out.printf("共%d个参数\n", args.length);
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.printf("第%d个参数为%s\n", i, args[i]);
            }
        }

        System.out.println("hello world! it`s:");
        System.out.println(new Date());

        DataOnly dataOnly = new DataOnly();
        System.out.printf("no init:%d %f %b %d\n", dataOnly.a, dataOnly.b, dataOnly.c, dataOnly.d);
        dataOnly.a = 10;
        System.out.println("dataOnly.a = " + dataOnly.a);
        dataOnly.b = 20D;
        System.out.println("dataOnly.b = " + dataOnly.b);
        dataOnly.c = true;
        System.out.println("dataOnly.c = " + dataOnly.c);
        System.out.printf("%d %f %b %d %b\n", dataOnly.a, dataOnly.b, dataOnly.c, dataOnly.d, dataOnly.isEqual());

        DataOnly dataOnly2 = new DataOnly();
        System.out.printf("no init:%d %f %b %d\n", dataOnly2.a, dataOnly2.b, dataOnly2.c, dataOnly2.d);
        dataOnly2.a = 100;
        System.out.println("dataOnly2.a = " + dataOnly2.a);
        dataOnly2.b = 22D;
        System.out.println("dataOnly2.b = " + dataOnly2.b);
        dataOnly2.c = true;
        System.out.println("dataOnly2.c = " + dataOnly2.c);
        DataOnly.increment();
        System.out.printf("%d %f %b %d %d %d %b\n", dataOnly2.a, dataOnly2.b, dataOnly2.c, dataOnly2.d, dataOnly.d, DataOnly.d, dataOnly2.isEqual());

        StringData stringData = new StringData();
        stringData.s = "aaaa";
        Integer stringLength = stringData.getStringLength();
        System.out.println("stringLength = " + stringLength);
    }
}

class DataOnly {
    Integer a;
    double b;
    boolean c;
    static int d = 10;

    /**
     * static 本类唯一，不受实例数量影响
     * void 无返回值
     */
    static void increment() {
        d++;
    }

    /**
     * 展示包装类对基类的自动包装功能，
     *
     * @return
     */
    public boolean isEqual() {
        return this.a.equals(d);
    }
}


class StringData {
    String s;

    public int getStringLength() {
        return this.s.length() * 2;
    }
}
