/**
 * 第八章练习3 添加新方法然后逐步重写，查看差别
 */
package class8.test3;

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
