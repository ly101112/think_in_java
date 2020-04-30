/**
 * 第九章练习6 接口方法自动public
 */
package class9.test6;

public class Test implements In6 {
    @Override
//    void call() { // 自动public，导致报错
    public void call() {
        System.out.println("Test.call()");
    }
}
