/**
 * 第九章练习15 接口继承和多重继承
 */
package class9.test15;

interface InA {
    void inA1();

    void inA2();
}

interface InB {
    void inB1();

    void inB2();
}

interface InC {
    void inC1();

    void inC2();
}

interface InD extends InA, InB, InC {
    void inD();
}

abstract class ClassA {
    public abstract void classA();
}

class ClassB extends ClassA implements InD {
    @Override
    public void classA() {
        System.out.println(getClass().getSimpleName() + ".classA()");
    }

    @Override
    public void inD() {
        System.out.println(getClass().getSimpleName() + ".inD()");
    }

    @Override
    public void inA1() {
        System.out.println(getClass().getSimpleName() + ".inA1()");
    }

    @Override
    public void inA2() {
        System.out.println(getClass().getSimpleName() + ".inA2()");
    }

    @Override
    public void inB1() {
        System.out.println(getClass().getSimpleName() + ".inB1()");
    }

    @Override
    public void inB2() {
        System.out.println(getClass().getSimpleName() + ".inB2()");
    }

    @Override
    public void inC1() {
        System.out.println(getClass().getSimpleName() + ".inC1()");
    }

    @Override
    public void inC2() {
        System.out.println(getClass().getSimpleName() + ".inC2()");
    }
}

public class Test {
    public static void q(InA x) {
        x.inA1();
        x.inA2();
    }

    public static void w(InB x) {
        x.inB1();
        x.inB2();
    }

    public static void e(InC x) {
        x.inC1();
        x.inC2();
    }

    public static void r(InD x) {
        x.inA1();
        x.inA2();
        x.inB1();
        x.inB2();
        x.inC1();
        x.inC2();
        x.inD();
    }

    public static void main(String[] args) {
        ClassB classB = new ClassB();
        q(classB);
        w(classB);
        e(classB);
        r(classB);
        classB.classA();
    }
}
