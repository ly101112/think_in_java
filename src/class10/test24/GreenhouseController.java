/**
 * 第十章练习24 内部类与控制框架--使用，修改时间为毫秒
 */
package class10.test24;

public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls greenhouseControls = new GreenhouseControls();
        greenhouseControls.addEvent(greenhouseControls.new Bell(8000));
        Event[] eventList = {
                greenhouseControls.new ThermostatNight(0),
                greenhouseControls.new LightOn(2000),
                greenhouseControls.new LightOff(4000),
                greenhouseControls.new WaterOn(6000),
                greenhouseControls.new WaterOff(8000),
                greenhouseControls.new FanOn(10000),
                greenhouseControls.new FanOff(12000),
                greenhouseControls.new ThermostatDay(14000),
        };
        greenhouseControls.addEvent(greenhouseControls.new Restart(20000, eventList));

        if (args.length == 1) {
            greenhouseControls.addEvent(greenhouseControls.new Terminate(new Integer(args[0])));
        }

        greenhouseControls.run();
    }
}
