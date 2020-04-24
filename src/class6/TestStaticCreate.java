package class6;

public class TestStaticCreate {
    private TestStaticCreate() {
        System.out.println("private TestStaticCreate");
    }

    static TestStaticCreate makeTestStatic() {
        return new TestStaticCreate();
    }
}
