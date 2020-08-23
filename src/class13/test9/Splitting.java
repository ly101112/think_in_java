/**
 * 第十三章练习9
 */
package class13.test9;

public class Splitting {

    public static String s = "Then, when you have found the shrubbery, you must" +
                            "cut down the mightiest tree int the forest... " +
                            "with... a herring!";

    public static void replaceString(String reg, String rep) {
        System.out.println(s.replaceAll(reg, rep));
    }

    public static void main(String[] args) {
        replaceString("[aeiouAEIOU]", "_");
    }
}
