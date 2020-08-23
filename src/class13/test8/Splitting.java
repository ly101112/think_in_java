/**
 * 第十三章练习8
 */
package class13.test8;

import java.util.Arrays;

public class Splitting {
    public static String s = "Then, when you have found the shrubbery, you must" +
                            "cut down the mightiest tree int the forest... " +
                            "with... a herring!";

    public static void splitString(String reg) {
        System.out.println(Arrays.toString(s.split(reg)));
    }

    public static void main(String[] args) {
        splitString("(the|you)");
    }
}
