/**
 * 第十二章练习21
 */
package class12.test21;

class BaseException extends Exception {}

class Base {
    public Base() throws BaseException {
        throw new BaseException();
    }
}

public class Test extends Base {
    public Test() throws BaseException {
        super();
//         catch(BaseException e) {}
//         try {
//        	super();
//         } catch(BaseException e) {}
    }

    public static void main(String[] args) {
        try {
            Test test = new Test();
        } catch (BaseException e) {
            e.printStackTrace();
        }
    }
}
