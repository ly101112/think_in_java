/**
 * 第十四章练习9 修改第十四章练习8
 */
package class14.test9;

import java.lang.reflect.Field;
import java.util.Arrays;

class A {
    private int aI;
}

class B extends A {
    private int bI;
}

class C extends B {
    private int cI;
}

public class Test {
    static void print(Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        if (declaredFields.length > 0) {
            System.out.println(obj.getClass() + " fields: " + Arrays.asList(declaredFields));
        }
        if (obj.getClass().getSuperclass() != null) {
            System.out.println(obj.getClass().getSuperclass());
            try {
                print(obj.getClass().getSuperclass().newInstance());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        print(new C());
    }
}
