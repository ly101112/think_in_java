/**
 * 第九章练习13 接口继承和多重继承
 */
package class9.test13;

interface InA {
    void inA();
}

interface InB extends InA {
    void inB();
}

interface InC extends InA {
    void inC();
}

interface InD extends InB, InC {
    void inD();
}

class ClassA implements InD {
    @Override
    public void inD() {

    }

    @Override
    public void inB() {

    }

    @Override
    public void inC() {

    }

    @Override
    public void inA() {

    }
}

public class Test {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.inA();
        classA.inB();
        classA.inC();
        classA.inD();
    }
}
