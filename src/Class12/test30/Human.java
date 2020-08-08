/**
 * 第十二章练习30
 */
package Class12.test30;

class Annoyance extends RuntimeException {}
class Sneeze extends Annoyance {}

class WrapCheckedException {
    public void throwRuntimeException(int i) {
        try {
            switch (i) {
                case 0: throw new Annoyance();
                case 1: throw new Sneeze();
                case 2: throw new RuntimeException("?????");
                default: return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

public class Human {
    public static void main(String[] args) {
        WrapCheckedException wrapCheckedException = new WrapCheckedException();
        try {
            for (int i = 0; i < 3; i++) {
                if (i < 3)
                    wrapCheckedException.throwRuntimeException(i);
                else
                    throw new RuntimeException();
            }
        } catch (RuntimeException runtimeException) {
            try {
                throw runtimeException.getCause();
            } catch (Sneeze sneeze) {
                System.out.println("Sneeze");
                sneeze.printStackTrace();
            } catch (Annoyance annoyance) {
                System.out.println("Annoyance");
                annoyance.printStackTrace();
            } catch (RuntimeException re) {
                System.out.println("RuntimeException");
                re.printStackTrace();
            } catch (Throwable throwable) {
                System.out.println("Throwable");
                throwable.printStackTrace();
            }
        }
    }
}
