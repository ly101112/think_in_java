/**
 * 第十二章练习18
 */
package Class12.test18;

class VeryImportantException extends Exception {
    @Override
    public String toString() {
        return "A very important exception";
    }
}

class HoHumException extends Exception {
    @Override
    public String toString() {
        return "A trivial exception";
    }
}

class SimpleException extends Exception {
    @Override
    public String toString() {
        return "A simple exception";
    }
}

public class LostMassage {

    public void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    public void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public void t() throws SimpleException {
        throw new SimpleException();
    }

    public static void main(String[] args) {
        try {
            LostMassage lostMassage = new LostMassage();
            try {
                lostMassage.f();
                lostMassage.dispose();
            } finally {
                lostMassage.t();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
