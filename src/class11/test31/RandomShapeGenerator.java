/**
 * 第十一章练习31 修改第八章练习4
 */
package class11.test31;

import java.util.Iterator;
import java.util.Random;

public class RandomShapeGenerator implements Iterable<Shape> {
    private Random random = new Random();
    private Shape[] shapes;

    RandomShapeGenerator(int x) {
        shapes = new Shape[x];
        for (int i = 0; i < x; i++) {
            shapes[i] = next();
        }
    }

    public Shape next() {
        switch (random.nextInt(4)) {
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            case 3:
                return new Ractangle();
        }
        return null;
    }

    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < shapes.length;
            }

            @Override
            public Shape next() {
                return shapes[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        RandomShapeGenerator shapes = new RandomShapeGenerator(10);
        for (Shape shape : shapes)
            System.out.println("shape: " + shape);
    }
}
