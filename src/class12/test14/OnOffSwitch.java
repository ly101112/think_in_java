/**
 * 第十二章练习14
 */
package class12.test14;

public class OnOffSwitch {
    private static Switch sw = new Switch();

    public static void f() throws OnOffException1, OnOffException2 {}

    public static void main(String[] args) {
        try {
            sw.on();
//            throw new RuntimeException();
            f();
            sw.off();
        } catch (OnOffException2 onOffException2) {
            onOffException2.printStackTrace();
            sw.off();
        } catch (OnOffException1 onOffException1) {
            onOffException1.printStackTrace();
            sw.off();
        } catch (RuntimeException e) {
            e.printStackTrace();
            sw.off();
        }
    }
}
