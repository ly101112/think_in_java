package class8.test4;

import java.util.Random;

public class RandomShapeGenerator {
    private Random random = new Random();
    public Shape next() {
        switch (random.nextInt(4)) {
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Ractangle();
        }
        return null;
    }
}
