/**
 * 第十四章练习7
 */
package class14.test7;

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("no args");
            System.exit(0);
        }

        for (String name : args) {
            try {
                Class.forName("class14.test7." + name);
            } catch (ClassNotFoundException e) {
                System.out.println("Couldn't found " + name);
            }
        }
    }
}
