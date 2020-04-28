/**
 * 第八章练习4 添加新类，查看多态对新旧类的区别
 */
package class8.test4;

public class Shapes {
    private static RandomShapeGenerator randomShapeGenerator = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = randomShapeGenerator.next();
        }
        for (Shape shape : s) {
            shape.draw();
            shape.growUp();
        }
    }
}
