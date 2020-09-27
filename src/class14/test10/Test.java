/**
 * 第十四章练习10
 */
package class14.test10;

public class Test {
    public static void main(String[] args) {
        char[] chars = new char[5];
        System.out.println(chars.getClass().getSuperclass());
        System.out.println(chars instanceof Object);
    }
}
