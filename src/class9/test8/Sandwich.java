/**
 * 第九章练习8 修改第八章练习11
 * 类的构造器调用顺序，子类调用会先调用父类，多次调用多次调用的多对多关系
 *
 * 添加并实现FastFood接口
 */
package class9.test8;

interface FastFood {
    void cheeseBurger();
    void frenchFires();
    void coke();
}

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

class Pickle extends Lettuce {
    Pickle() {
        System.out.println("Pickle()");
    }
}

public class Sandwich extends PortableLunch implements FastFood {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();

    Sandwich() {
        System.out.println("Sandwich()");
    }

    @Override
    public void coke() {
        System.out.println("coke()");
    }

    @Override
    public void frenchFires() {
        System.out.println("frenchFires()");
    }

    @Override
    public void cheeseBurger() {
        System.out.println("cheeseBurger()");
    }

    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        sandwich.cheeseBurger();
        sandwich.frenchFires();
        sandwich.coke();
    }
}
