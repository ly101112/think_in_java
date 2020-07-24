/**
 * 第十一章练习1 arrayList
 */
package class11.test1;

import java.util.ArrayList;

public class Gerbil {
    private int gerbilNumber;
    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("gerbil jump " + gerbilNumber + " hops");
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for (int i = 0; i < 5; i++) {
            gerbils.add(new Gerbil(i));
        }

        for (int i = 0; i < gerbils.size(); i++) {
            gerbils.get(i).hop();
        }
    }
}
