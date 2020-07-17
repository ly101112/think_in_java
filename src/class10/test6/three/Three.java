/**
 * 第十章练习6 内部类于向上转型
 */
package class10.test6.three;

import class10.test6.one.One;
import class10.test6.two.Two;

public class Three extends Two {

    public InnerTwo getInnerTwo() {
        System.out.println("Three.getInnerTwo");
        return this.new InnerTwo();
    }

    public static void main(String[] args) {
        Three three = new Three();
        One innerTwo = three.getInnerTwo();
        System.out.println("innerTwo.value = " + innerTwo.value());
    }
}
