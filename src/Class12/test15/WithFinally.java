/**
 * 第十二章练习15
 */
package Class12.test15;

import Class12.test14.OnOffException1;
import Class12.test14.OnOffException2;
import Class12.test14.OnOffSwitch;
import Class12.test14.Switch;

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
