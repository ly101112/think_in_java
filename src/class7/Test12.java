package class7;

class Component11{
    Component11() {
        System.out.println("Component11");
    }

    void dispose() {
        System.out.println("Component11 dispose");
    }
}

class Component21{
    Component21() {
        System.out.println("Component21");
    }

    void dispose() {
        System.out.println("Component21 dispose");
    }
}

class Component31{
    Component31() {
        System.out.println("Component31");
    }

    void dispose() {
        System.out.println("Component31 dispose");
    }
}

class Root1{
    Component11 c1;
    Component21 c2;
    Component31 c3;
    Root1() {
        c1 = new Component11();
        c2 = new Component21();
        c3 = new Component31();
        System.out.println("Root1");
    }

    void dispose() {
        c1.dispose();
        c2.dispose();
        c3.dispose();
        System.out.println("Root1 dispose");
    }
}

public class Test12 extends Root1 {
    Test12() {
        System.out.println("Test12");
    }

    void dispose() {
        super.dispose();
        System.out.println("Test12 dispose");
    }

    public static void main(String[] args) {
        Test12 test12 = new Test12();
        test12.dispose();
        System.out.println(test12);
    }
}
