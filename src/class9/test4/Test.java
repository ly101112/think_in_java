/**
 * 第九章练习4
 * 空抽象类被继承后，实例化对象需要向下转型才能调用对应方法
 * 抽象方法被子类重写后，可以用父类类型，不需要向下转型
 */
package class9.test4;

abstract class Dad {
}

class Son extends Dad {
    protected void call() {
        System.out.println("Son.call()");
    }
}

abstract class Dad2 {
    abstract public void call();
}

class Son2 extends Dad2 {
    @Override
    public void call() {
        System.out.println("Son2.call()");
    }
}

public class Test {
    public static void test(Dad dad) {
        ((Son) dad).call();
    }

    public static void test2(Dad2 dad2) {
        dad2.call();
    }

    public static void main(String[] args) {
        Son son = new Son();
        test(son);
        Son2 son2 = new Son2();
        test2(son2);
    }
}
