/**
 * 第八章练习15 构造器调用重写方法的问题
 */
package class8.test15;

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }
    Glyph() {
        System.out.println("before draw");
        draw();
        System.out.println("after draw");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int length = 2;
    private int width = 4;
    RectangularGlyph(int l, int w) {
        length = l;
        width = w;
        System.out.println("RectangularGlyph.RectangularGlyph(), length = "
                + length + ", width = " + width);
    }
    @Override
    void draw() {
        System.out.println("RectangularGlyph.draw(), length = " + length
                + ", width = " + width);
    }
}


public class PolyConstructor {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(3, 6);
    }
}