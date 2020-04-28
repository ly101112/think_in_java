/**
 * 第七章练习17 向上转型，修改Frog
 */
package class7;

class Amphibian1 {
    void f() {
        System.out.println("aaaaaaaaaaaaaaaaaa");
    }

    static void turn(Amphibian1 amphibian) {
        System.out.println("amphibian is an Amphibian1");
    }
}

public class FrogT17 extends Amphibian1 {
    void f() {
        System.out.println("bbbbbbbbbbbbbbbbbb");
    }

    static void turn(Amphibian1 amphibian) {
        System.out.println("amphibian is an Amphibian1 bbbbbbbbb");
    }

    public static void main(String[] args) {
        FrogT17 frog = new FrogT17();
        frog.f();
        Amphibian1.turn(frog);
        FrogT17.turn(frog);
    }
}
