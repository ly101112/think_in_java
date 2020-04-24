package class5;

public class T5 {
    public static void main(String... args) {
        if (args.length > 0) {
            for (String a: args) {
                System.out.println(a);
            }
        }
        Test1 test1 = new Test1();
        System.out.println(test1.s);
        Test2 test2 = new Test2();
        System.out.println(test2.a);
        System.out.println(test2.s);

        Dog dog = new Dog();
        dog.bark();
        dog.bark((char) 'a');
        dog.bark((String) "aaa");
        dog.bark((String) "aaa", 1);
        dog.bark(1, (String) "aaa");

        Test4 test4 = new Test4();

        Test5 test5 = new Test5();
        test5.a();

        Test6 test6 = new Test6();

        Test7 t7 = new Test7();
        t7.checkIn();
        new Test7(); // 为赋值给变量才能引起finalize

        Tank tank = new Tank();
        tank.empty();
        Tank tank1 = new Tank();
        new Tank();

        System.gc();

        Cups.cup1.f(99);

        Test8.p();

        String[] arString = new String[] {"aaaa", "bbbb", "cccc", "dddd"};
        for (int i = 0; i < arString.length; i++) {
            System.out.println(arString[i]);
        }

        Test10[] arTest10 = new Test10[3];
        Test10[] arTest101 = new Test10[] {new Test10("sss"), new Test10("wwww")};

        new Test11("aa", "bb", "cc", "dd");

        for (Money money: Money.values()) {
            System.out.print(money + ", ordinal = " + money.ordinal() + "  ");
            switch (money) {
                case ONE:
                    System.out.println("一元");break;
                case FIVE:
                    System.out.println("五元");break;
                case TEN:
                    System.out.println("十元");break;
                case TWENTY:
                    System.out.println("二十元");break;
                case FIFTY:
                    System.out.println("五十元");break;
                default:
                    System.out.println("错误类型");
            }
        }
    }
//    static Cups cups1 = new Cups();
//    static Cups cups3 = new Cups();
}

/**
 * 自动初始化null
 */
class Test1 {
    String s;
}

/**
 * 构造器初始化
 */
class Test2 {
    String s;
    String a = "aaaa";

    Test2() {
        s = "sssss";
    }
}

/**
 * 默认构造器和带参数构造器
 */
class Test3 {
    Test3() {
        System.out.println("test3");
    }

    Test3(String s) {
        System.out.println("test3 " + s);
    }
}

/**
 * 方法重载
 */
class Dog{
    void bark() {
        System.out.println("汪汪");
    }

    void bark(char s) {
        System.out.println("咆哮");
    }

    void bark(String s) {
        System.out.println("呜咽");
    }

    void bark(String a, int b) {
        System.out.println("呜呜呜呜呜呜呜");
    }

    void bark(int a, String b) {
        System.out.println("嗷嗷嗷嗷嗷嗷");
    }
}

/**
 * 无构造器编译器自动给添加测试
 */
class Test4{}

/**
 * 内部调用编译器自动添加this关键字
 */
class Test5{
    void a() {
        b();
        this.b();
    }
    void b() {
        System.out.println('b');
    }
}

/**
 * 构造器调用构造器(this关键字调用)
 */
class Test6{
    Test6(){
        this(10);
        System.out.println("默认构造器");
    }

    Test6(int a) {
        System.out.println(a);
    }
}

/**
 * finalize 总结处理
 */
class Test7{
    boolean checked = false;

    void checkIn() {
        this.checked = true;
    }

    protected void finalize() throws Throwable {
        if (!this.checked) {
            System.out.println("ERROR: false");
        }
//        super.finalize(); // 不调用也可以，如果要自己处理，可以省略
    }
}

/**
 * 测试finalize出发条件
 */
class Tank{
    String status = "full";

    void empty() {
        this.status = "empty";
    }

    protected void finalize() throws Throwable {
        if (this.status == "full") {
            System.out.println("ERROR: full");
        }
//        super.finalize();
    }
}

/**
 * 显式的静态初始化
 */
class Cup{
    Cup(int marker){
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups{
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}

/**
 * 验证初始化动作是否在使用前
 */
class Test8{
    static String a = "asd";
    static String b;
    static {
        b = "cccc";
        System.out.println("定义:" + a);
        System.out.println("定义:" + b);
    }

    static void p() {
        System.out.println(a);
        System.out.println(b);
    }
}

/**
 * 实例初始化子句
 */
class Test9{
    String a;
    {
        a = "aaaa";
        System.out.println("实例初始化");
    }
}

/**
 * 对象数组实例初始化测试
 */
class Test10{
    Test10(String s){
        System.out.println("初始化：" + s);
    }
}

/**
 * 可变参数
 */
class Test11{
    Test11(String... arString) {
        for (String a: arString) {
            System.out.println(a);
        }
    }
}

/**
 * 枚举类型
 */
enum Money{
    ONE, FIVE, TEN, TWENTY, FIFTY
}
