/**
 * 第十章练习16 匿名类工厂模式
 */
package class10.test16;

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

    public static CycleFactory getCycleFactory = new CycleFactory() {

        @Override
        public Cycle getCycle() {
            return new Unicycle();
        }
    };
}

class Bicycle implements Cycle {
    @Override
    public void draw() {
        System.out.println(getClass().getSimpleName() + ".draw()");
    }

    public static CycleFactory getCycleFactory = new CycleFactory() {

        @Override
        public Cycle getCycle() {
            return new Bicycle();
        }
    };
}

class Tricycle implements Cycle {
    @Override
    public void draw() {
        System.out.println(getClass().getSimpleName() + ".draw()");
    }

    public static CycleFactory getCycleFactory = new CycleFactory() {

        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    };
}

public class Cycles {
    public static void getCycle(CycleFactory cycleFactory) {
        Cycle cycle = cycleFactory.getCycle();
        cycle.draw();
    }

    public static void main(String[] args) {
        getCycle(Unicycle.getCycleFactory);
        getCycle(Bicycle.getCycleFactory);
        getCycle(Tricycle.getCycleFactory);
    }
}
