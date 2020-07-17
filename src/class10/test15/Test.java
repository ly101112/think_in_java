/**
 * 第十章练习15 通过匿名类返回有参数的类的对象
 */
package class10.test15;

class Test1 {
    private int x = 1;
    public Test1(int x) {
        this.x *= 2 * x;
        System.out.println("new " + getClass().getSimpleName() + x);
    }

    public void showX() {
        System.out.println(x);
    }
}

public class Test {
    public Test1 getTest1(int x) {
        return new Test1(x) {
            {
                System.out.println("匿名类" + x);
            }
        };
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.getTest1(2).showX();
    }
}
