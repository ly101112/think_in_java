package class8.test4;

public class Ractangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    @Override
    public void growUp() {
        System.out.println("Triangle is growUp!");
    }
}
