package class6;

public class Vector {
    public Vector() {
        System.out.println("class6.Vector()");
    }

    public void f(){
        System.out.println("public");
    }

    protected void f2() {
        System.out.println("protected");
    }

    void f3() {
        System.out.println("default");
    }

    private void f4() {
        System.out.println("private");
    }
}
