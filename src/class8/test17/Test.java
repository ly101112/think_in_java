package class8.test17;

/**
 * 第八章练习17 向上转型和向下转型
 */

class Cycle {
    protected void ride() {
        System.out.println("Cycle.ride()");
    }
}

class Unicycle extends Cycle {
    protected void balance() {
        System.out.println("Unicycle.balance");
    }

    protected void ride() {
        System.out.println("Unicycle.ride()");
    }
}

class Bicycle extends Cycle {
    protected void balance() {
        System.out.println("Bicycle.balance");
    }

    protected void ride() {
        System.out.println("Bicycle.ride()");
    }
}

class Tricycle extends Cycle {
    protected void ride() {
        System.out.println("Tricycle.ride()");
    }
}

public class Test {
    public static void ride(Cycle cycle) {
        cycle.ride();
    }

    public static void main(String[] args) {
        Cycle[] cycles = {
                new Unicycle(),
                new Bicycle(),
                new Tricycle(),
        };
//        cycles[0].balance();
//        cycles[1].balance();
//        cycles[2].balance();
        ((Unicycle) cycles[0]).balance();
        ((Bicycle) cycles[1]).balance();
//        ((Tricycle)cycles[2]).balance();
    }
}
