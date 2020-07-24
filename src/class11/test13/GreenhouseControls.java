/**
 * 第十一章练习13 复用第十章练习25 内部类与控制框架--控制器实现
 */
package class11.test13;


import class10.test24.Event;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GreenhouseControls extends GreenhouseControlsBase {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private boolean waterMist = false;

    public class WaterMistOn extends Event {

        public WaterMistOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            waterMist = true;
        }

        @Override
        public String toString() {
            return simpleDateFormat.format(new Date()) + " waterMist is on";
        }
    }

    public class WaterMistOff extends Event {
        public WaterMistOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            waterMist = false;
        }

        @Override
        public String toString() {
            return simpleDateFormat.format(new Date()) + " waterMist is off";
        }
    }

}
