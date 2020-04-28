/**
 * 第七章练习1 惰性初始化
 */
package class7;

public class Delay {
    private Simple simple;

    public static void main(String[] args) {
        Delay delay = new Delay();
        System.out.println(delay);
    }

    public String toString() {
        if (simple == null) {
            simple = new Simple(); // 惰性初始化
            System.out.println("delayed initialization");
        }
        return "Delay{" +
                "simple=" + simple +
                '}';
    }
}

class Simple {
}
