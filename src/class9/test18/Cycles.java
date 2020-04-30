/**
 * 第九章练习18 工厂模式，练习
 */
package class9.test18;

interface Cycle {
    void draw();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    @Override
    public void draw() {
        System.out.println(getClass().getSimpleName() + ".draw()");
    }
}

class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle {
    @Override
    public void draw() {
        System.out.println(getClass().getSimpleName() + ".draw()");
    }
}

class BicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {
    @Override
    public void draw() {
        System.out.println(getClass().getSimpleName() + ".draw()");
    }
}

class TricycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

public class Cycles {
    public static void getCycle(CycleFactory cycleFactory) {
        Cycle cycle = cycleFactory.getCycle();
        cycle.draw();
    }

    public static void main(String[] args) {
        UnicycleFactory unicycleFactory = new UnicycleFactory();
        getCycle(unicycleFactory);
        BicycleFactory bicycleFactory = new BicycleFactory();
        getCycle(bicycleFactory);
        TricycleFactory tricycleFactory = new TricycleFactory();
        getCycle(tricycleFactory);
    }
}
