/**
 * 第十二章练习15
 */
package class12.test15;

import class12.test14.OnOffException1;
import class12.test14.OnOffException2;
import class12.test14.OnOffSwitch;
import class12.test14.Switch;

public class WithFinally {
    static Switch sw = new Switch();

    public static void main(String[] args) {
        try {
            sw.on();
//            throw new RuntimeException();
            OnOffSwitch.f();
        } catch (OnOffException2 onOffException2) {
            onOffException2.printStackTrace();
        } catch (OnOffException1 onOffException1) {
            onOffException1.printStackTrace();
        } finally {
            sw.off();
        }
    }
}
