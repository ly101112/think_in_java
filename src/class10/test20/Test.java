/**
 * 第十章练习20 接口里的嵌套类（自动public static）
 */
package class10.test20;

public interface Test {
    void p();

    class TesTInterface implements Test {
        @Override
        public void p() {
            System.out.println(getClass().getSimpleName());
        }

        public static void main(String[] args) {
            TesTInterface tesTInterface = new TesTInterface();
            tesTInterface.p();
        }
    }
}
