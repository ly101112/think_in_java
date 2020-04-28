/**
 * 第七章练习2 继承、重写和调用父类方法
 */
package class7;

public class Thread extends Detergent {
    public void scrub() {
        append(" Thread.scrub()");
        super.scrub();
    }

    public void sterilize() {
        append(" sterilize()");
    }

    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.dilute();
        thread.apply();
        thread.scrub();
        thread.foam();
        thread.sterilize();
        System.out.println(thread);
        System.out.println("测试父类");
        Detergent.main(args);
    }
}

class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser();
        cleanser.dilute();
        cleanser.apply();
        cleanser.scrub();
        System.out.println(cleanser);
    }
}

class Detergent extends Cleanser {

    // 重写
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // 调用父类的scrub
    }

    public void foam() {
        append(" foam()");
    }

    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        System.out.println(detergent);
        System.out.println("测试父类");
        Cleanser.main(args);
    }
}
