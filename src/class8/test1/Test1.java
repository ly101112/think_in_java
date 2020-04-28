/**
 * 第八章练习1 向上转型
 */
package class8.test1;

class Cycle {
    protected void ride() {
        System.out.println("Cycle.ride()");
    }
}

class Unicycle extends Cycle {
    protected void ride() {
        System.out.println("Unicycle.ride()");
    }
}

class Bicycle extends Cycle {
    protected void ride() {
        System.out.println("Bicycle.ride()");
    }
}

class Tricycle extends Cycle {
    protected void ride() {
        System.out.println("Tricycle.ride()");
    }
}

public class Test1 {
    public static void ride(Cycle cycle) {
        cycle.ride();
    }

    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        ride(unicycle);
        ride(bicycle);
        ride(tricycle);
    }
}
