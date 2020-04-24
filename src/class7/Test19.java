package class7;

/**
 * 第七章练习19 空白final，有构造器赋值
 */
public class Test19 {
    public final int i;

    public Test19() {
        i = 1;
    }

    public Test19(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        Test19 test19 = new Test19();
        Test19 test191 = new Test19(11);
//        test19.i = 1111; // 不能修改
    }
}
