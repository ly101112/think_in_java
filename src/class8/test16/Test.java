/**
 * 第八章练习16 组合和继承的同时使用区别。
 * 组合更加灵活，可以动态选择类型。
 * 继承则相反，需要在编译时知道确切类型
 */
package class8.test16;

class AlertStatus {
    public void status() {
    }
}

class Start extends AlertStatus {
    @Override
    public void status() {
        System.out.println("engine start");
    }
}

class Stop extends AlertStatus {
    @Override
    public void status() {
        System.out.println("engine stop");
    }
}

class Fire extends AlertStatus {
    @Override
    public void status() {
        System.out.println("engine is firing");
    }
}

class StarShip {
    AlertStatus status = new Stop();

    void start() {
        status = new Start();
    }

    void stop() {
        status = new Stop();
    }

    void fire() {
        status = new Fire();
    }

    void reportStatus() {
        status.status();
    }
}

public class Test {
    public static void main(String[] args) {
        StarShip starShip = new StarShip();
        starShip.reportStatus();
        starShip.start();
        starShip.reportStatus();
        starShip.fire();
        starShip.reportStatus();
    }
}
