package class6;

public class T6 {
    protected void f() {
        System.out.println("protected");
    }

    public void fx() {
        System.out.println("public");
    }

    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.f();
        vector.f2();
        vector.f3();
//        vector.f4();

        TestStaticCreate testStaticCreate = TestStaticCreate.makeTestStatic();
        for (int i = 0; i < 5; i++) {
            System.out.println(ConnectionManage.getConnection(i));
        }
    }
}
