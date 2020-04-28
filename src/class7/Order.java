/**
 * 第七章练习3-4 子类初始化，会先初始化父类，只有一种方法：
 * 在子类的构造方法里面调用父类的构造方法，一般由java自动在子类的构造器中插入对父类构造器的调用
 */
package class7;

public class Order {
    public static void main(String[] args) {
        Three three = new Three();
    }
}

class One {
    public One() {
        System.out.println("one");
    }
}

class Two extends One {
    public Two() {
        System.out.println("two");
    }
}

class Three extends Two {
    public Three() {
        System.out.println("three");
    }
}
