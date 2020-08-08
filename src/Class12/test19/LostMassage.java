/**
 * 第十二章练习19
 */
package Class12.test19;

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
            } finally {
                lostMassage.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
