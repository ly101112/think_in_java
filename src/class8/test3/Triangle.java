package class8.test3;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

//    @Override
//    public void growUp() {
//        System.out.println("Triangle is growUp!");
//    }
}
