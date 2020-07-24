/**
 * 第十一章练习7
 */
package class11.test7;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {
        List<MyClass> myClasses = new ArrayList<MyClass>();

        for (int i = 0; i < 10; i++) {
            myClasses.add(new MyClass());
        }

        List<MyClass> sub = myClasses.subList(2, 6);

        myClasses.removeAll(sub);
    }
}
