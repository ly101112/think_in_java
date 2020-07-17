/**
 * 第十章练习23
 */
package class10.test23;

interface U {
    void u1();

    void u2();

    void u3();
}

class A {
    public U getU() {
        return new U() {
            @Override
            public void u1() {
                System.out.println("u1");
            }

            @Override
            public void u2() {
                System.out.println("u2");
            }

            @Override
            public void u3() {
                System.out.println("u3");
            }
        };
    }
}

class B {
    private static int x = 0;
    private U[] arrU;

    public B(int size) {
        arrU = new U[size];
        System.out.println(getClass().getSimpleName() + " new " + size + " U");
    }

    public void add(U u) {
        arrU[x] = u;
        x++;
    }

    public void setNull(int index) {
        arrU[index] = null;
        System.out.println(index + " now is null");
    }

    public void testU(int index) {
        if (arrU[index] == null)
            System.out.println(index + " is null");
        else
            System.out.println(index + " is not null");
    }

    public void each() {
        for (U u : arrU) {
            u.u1();
            u.u2();
            u.u3();
        }
    }
}

public class Test {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        B b = new B(4);
        b.add(a1.getU());
        b.add(a2.getU());
        b.add(a3.getU());
        b.add(a4.getU());
        b.each();
        b.setNull(2);
        b.testU(2);
        // 空指针 java.lang.NullPointerException
//        b.each();
    }
}
