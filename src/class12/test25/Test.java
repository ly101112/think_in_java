/**
 * 第十二章练习25
 */
package class12.test25;

class BaseException extends Exception {}
class SecondException extends BaseException {}
class ThirdException extends SecondException {}

class Base {
    public void msg() throws BaseException {
        throw new BaseException();
    }
}

class Second extends Base {
    @Override
    public void msg() throws SecondException {
        throw new SecondException();
    }
}

class Third extends Second {
    @Override
    public void msg() throws ThirdException {
        throw new ThirdException();
    }
}

public class Test {
    public static void main(String[] args) {
        Base third = new Third();
        try {
            third.msg();
        } catch (ThirdException e) {
            System.out.println("ThirdException");
            e.printStackTrace();
        } catch (SecondException e) {
            System.out.println("SecondException");
            e.printStackTrace();
        } catch (BaseException e) {
            System.out.println("BaseException");
            e.printStackTrace();
        }
    }
}
