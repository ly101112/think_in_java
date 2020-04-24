package class7;

/**
 * 第七章练习16 向上转型
 */

class Amphibian {
    void f() {
        System.out.println("aaaaaaaaaaaaaaaaaa");
    }

    static void turn(Amphibian amphibian) {
        System.out.println("amphibian is an Amphibian");
    }
}

public class Frog extends Amphibian {
    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.f();
        Amphibian.turn(frog);
    }
}
