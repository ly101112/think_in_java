/**
 * 第八章练习5 验证多态
 */
package class8.test5;

class Cycle1 {
    protected void ride() {
        System.out.println("Cycle.ride()");
    }

    protected int wheels() {
        System.out.println("Cycle.wheels()");
        return 0;
    }
}

class Unicycle1 extends Cycle1 {
    @Override
    protected void ride() {
        System.out.println("Unicycle.ride()" + wheels());
    }

    @Override
    protected int wheels() {
        return 1;
    }
}

class Bicycle1 extends Cycle1 {
    @Override
    protected void ride() {
        System.out.println("Bicycle.ride()" + wheels());
    }

    @Override
    protected int wheels() {
        return 2;
    }
}

class Tricycle1 extends Cycle1 {
    @Override
    protected void ride() {
        System.out.println("Tricycle.ride()" + wheels());
    }

    @Override
    protected int wheels() {
        return 3;
    }
}

public class Test5 {
    public static void ride(Cycle1 cycle) {
        cycle.ride();
    }

    public static void main(String[] args) {
        Unicycle1 unicycle = new Unicycle1();
        Bicycle1 bicycle = new Bicycle1();
        Tricycle1 tricycle = new Tricycle1();
        ride(unicycle);
        ride(bicycle);
        ride(tricycle);
    }
}
