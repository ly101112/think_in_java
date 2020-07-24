/**
 * 第十一章练习15 栈
 */
package class11.test15;

public class StackLearn {
    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();
        strings.push("U");
        strings.push("n");
        strings.push("c");
        System.out.printf("%s ", strings.pop());
        System.out.printf("%s ", strings.pop());
        System.out.printf("%s ", strings.pop());
        strings.push("e");
        strings.push("r");
        strings.push("t");
        System.out.printf("%s ", strings.pop());
        System.out.printf("%s ", strings.pop());
        System.out.printf("%s ", strings.pop());
        strings.push("a");
        System.out.printf("%s ", strings.pop());
        strings.push("i");
        System.out.printf("%s ", strings.pop());
        strings.push("n");
        strings.push("t");
        strings.push("y");
        System.out.printf("%s ", strings.pop());
        System.out.printf("%s ", strings.pop());
        System.out.printf("%s ", strings.pop());
        strings.push("");
        System.out.printf("%s ", strings.pop());
        strings.push("r");
        strings.push("u");
        System.out.printf("%s ", strings.pop());
        System.out.printf("%s ", strings.pop());
        strings.push("l");
        strings.push("e");
        strings.push("s");
        System.out.printf("%s ", strings.pop());
        System.out.printf("%s ", strings.pop());
        System.out.printf("%s \n", strings.pop());
    }
}
