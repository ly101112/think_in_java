/**
 * 第十三章练习3
 */
package class13.test3;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle {
    private String s;
    private Formatter f;

    public Turtle(String name, Formatter f) {
        s = name;
        this.f = f;
    }

    public void move(int x, int y) {
        f.format("%s The Turtle is at (%d, %d)\n", s, x, y);
    }

    public static void main(String[] args) {
        PrintStream err = System.err;
        Turtle tommy = new Turtle("Tommy", new Formatter(System.err));
        Turtle terry = new Turtle("Terry", new Formatter(err));

        tommy.move(0, 0);
        terry.move(4, 8);
        tommy.move(3, 4);
        terry.move(2, 5);
        tommy.move(3, 3);
        terry.move(3, 3);
    }
}
