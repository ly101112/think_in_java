/**
 * 第十四章练习6
 */
package class14.test6;

import java.util.Arrays;
import java.util.List;

class Shape {
    public void draw(){}
    public void erase(){}
    public void growUp() {
        System.out.println("Shape is growing!");
    }
}

class Circle extends Shape {
    public boolean mark = false;

    @Override
    public void draw() {
        System.out.println("Circle.draw()" + (mark ? " marked" : ""));
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void growUp() {
        System.out.println("Circle is growUp!");
    }
}

class Ractangle extends Shape {
    public boolean mark = false;

    @Override
    public void draw() {
        System.out.println("Triangle.draw()" + (mark ? " marked" : ""));
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

class Square extends Shape {
    public boolean mark = false;

    @Override
    public void draw() {
        System.out.println("Square.draw()" + (mark ? " marked" : ""));
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void growUp() {
        System.out.println("Square is growUp!");
    }
}

class Triangle extends Shape {
    public boolean mark = false;

    @Override
    public void draw() {
        System.out.println("Triangle.draw()" + (mark ? " marked" : ""));
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

class Rhomboid extends Shape {
    public boolean mark = false;

    @Override
    public void draw() {
        System.out.println("Rhomboid.draw()" + (mark ? " marked" : ""));
    }

    @Override
    public void erase() {
        System.out.println("Rhomboid.erase()");
    }

    @Override
    public void growUp() {
        System.out.println("Rhomboid.growUp()");
    }
}

public class Shapes {
    public static void rotate(Shape shape) {
        if (!(shape instanceof Circle))
            shape.draw();
    }

    public static void setMark(Shape shape) {
        if (shape instanceof Triangle)
            ((Triangle) shape).mark = true;
    }

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );

        for(Shape shape : shapeList) {
            setMark(shape);
            rotate(shape);
        }
    }
}
