/**
 * 第十三章练习2
 */
package class13.test2;

import java.util.ArrayList;

public class InfiniteRecursion {
    @Override
    public String toString() {
        // this会调用自身的toString，无限循环，所以用Object.toString
        return " InfiniteRecursion address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        ArrayList<InfiniteRecursion> infiniteRecursions = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            infiniteRecursions.add(new InfiniteRecursion());
        }
        System.out.println(infiniteRecursions);
    }
}
