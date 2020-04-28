package class8.test2;

import java.util.Random;

public class RandomShapeGenerator {
    private Random random = new Random();
    public Shape next() {
        switch (random.nextInt(3)) {
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
        return null;
    }
}
