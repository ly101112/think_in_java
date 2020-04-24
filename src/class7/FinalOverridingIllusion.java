package class7;

/**
 * 第七章练习20、21 @override的作用（声明重写方法） final方法不能重写
 */

class WithFinals {
    final void f() {
        System.out.println("WithFinal.f()");
    }

    void g() {
        System.out.println("WithFinal.g()");
    }

    final void h() {
        System.out.println("WitFinal.h()");
    }
}

class OverridingPrivate extends WithFinals {
    // attempt to override:
//    public final void f() {
//        System.out.println("OverrideFinal.f()");
//    } // no can do

    @Override
    public void g() {
        System.out.println("OverrideFinal.g()");
    } // OK, not final

//    final void h() {
//        System.out.println("OVerrideFinal.h()");
//    } // cannot override final
}

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate of = new OverridingPrivate();
        of.f();
        of.g();
        of.h();
        // Upcast:
        WithFinals wf = of;
        wf.f();
        wf.g();
        wf.h();
    }
}
