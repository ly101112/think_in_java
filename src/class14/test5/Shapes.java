/**
 * 第十四章练习5
 */
package class14.test5;

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
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
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

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
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

class Rhomboid extends Shape {
    @Override
    public void draw() {
        System.out.println("Rhomboid.draw()");
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

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        for(Shape shape : shapeList)
            rotate(shape);
    }
}
