/**
 * 第七章练习11 代理
 */
package class7;

public class Test11 {
    Detergent11 detergent11 = new Detergent11();

    public void append(String a) {
        detergent11.append(a);
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" Test11.scrub()");
        detergent11.scrub();
    }

    public void foam() {
        append(" foam()");
        detergent11.foam();
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

class Cleanser11 {
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

class Detergent11 {

    Cleanser11 cleanser11 = new Cleanser11();

    public void append(String a) {
        cleanser11.append(a);
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" Detergent.scrub()");
        cleanser11.scrub();
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
