/**
 * 第十二章练习27 修改第十二章练习3 越界异常
 */
package class12.test27;

class WrapCheckedException {
    public void throwRuntimeException() {
        try {
            throw new IndexOutOfBoundsException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        WrapCheckedException wrapCheckedException = new WrapCheckedException();
        try {
            wrapCheckedException.throwRuntimeException();
        } catch (RuntimeException runtimeException) {
            try {
                throw runtimeException.getCause();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("IndexOutOfBoundsException");
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Exception");
                e.printStackTrace();
            } catch (Throwable throwable) {
                System.out.println("Throwable");
                throwable.printStackTrace();
            }
        }
    }
}
