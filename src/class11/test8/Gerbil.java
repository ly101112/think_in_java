/**
 * 第十一章练习8 迭代器：iterator
 */
package class11.test8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gerbil {
    private int gerbilNumber;
    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("gerbil jump " + gerbilNumber + " hops");
    }

    public static void main(String[] args) {
        List<Gerbil> gerbils = new ArrayList<Gerbil>();
        for (int i = 0; i < 5; i++) {
            gerbils.add(new Gerbil(i));
        }

        Iterator<Gerbil> iterator = gerbils.iterator();
        while (iterator.hasNext()) {
            iterator.next().hop();
//            iterator.remove();
        }
    }
}
