/**
 * 第十二章练习23 修改第十二章练习22
 */
package class12.test23;

class BaseException extends Exception {}

class Base {
    public Base() throws BaseException {
//        throw new BaseException();
    }

}

class Test {
    public void dispose() {
        System.out.println("base dispose");
    }
}

public class FailingConstructor extends Base {
    private Test test1;
    private Test test2;

    public FailingConstructor() throws BaseException {
        try {
            test1 = new Test();

            try {
                test2 = new Test();
            } catch (Exception e) {
                test1.dispose();
                e.printStackTrace(System.out);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public static void main(String[] args) {
        try {
            FailingConstructor failingConstructor = new FailingConstructor();
        } catch (BaseException e) {
            e.printStackTrace(System.out);
        }
    }
}
