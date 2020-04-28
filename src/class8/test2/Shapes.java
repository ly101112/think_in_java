/**
 * 第八章练习2 添加@Override注解
 */
package class8.test2;

public class Shapes {
    private static RandomShapeGenerator randomShapeGenerator = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = randomShapeGenerator.next();
        }
        for (Shape shape : s) {
            shape.draw();
        }
    }
}
