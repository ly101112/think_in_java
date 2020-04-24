package class7;

/**
 * 第七章练习23、24 类的继承与初始化顺序（类只加载一次，即使多次调用）
 */

class Insect {
    private int i = 0;
    protected int j;

    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");
    protected int l = printInit("Beetle.l initialized");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle beetle = new Beetle();
    }
}

public class Cockroach extends Beetle {
    private int s = printInit("Cockroach.s initialized");

    public Cockroach() {
        System.out.println("l = " + l);
        System.out.println("s = " + s);
        System.out.println("l = " + j);
    }

    private static int x3 = printInit("static Cockroach.x3 initialized");

    public static void main(String[] args) {
        System.out.println("Cockroach begin");
        Cockroach cockroach = new Cockroach();
        printInit("test");
    }
}
