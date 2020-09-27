/**
 * 第十四章练习2
 */
package class14.test2;

interface HasBatterier {
}

interface Waterproof {
}

interface Shoots {
}

interface Test {}

class Toy {
    //    Toy() {}
    Toy(int i) {
    }
}

class FancyToy extends Toy implements HasBatterier, Waterproof, Shoots, Test {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() + " is interface？ [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("class14.test2.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }

        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }

        Class up = c.getSuperclass();
        Object object = null;
        try {
            object = up.newInstance();
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        }

        printInfo(object.getClass());
    }
}
