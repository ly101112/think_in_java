/**
 * 第十二章练习22
 */
package class12.test22;

class BaseException extends Exception {}

class Base {
    public Base() throws BaseException {
        throw new BaseException();
    }
}

public class FailingConstructor extends Base {
    public FailingConstructor() throws BaseException {
    }

    public static void main(String[] args) {
        try {
            FailingConstructor failingConstructor = new FailingConstructor();
        } catch (BaseException e) {
            e.printStackTrace(System.out);
        }
    }
}
