/**
 * 第十一章练习10 修改第八章练习9，用ArrayList来存放Rodents，并用迭代器来访问list
 */
package class11.test10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

class Rodent {
    public void kill() {
        System.out.println("kill it!!");
    }
}

class Mouse extends Rodent {
    @Override
    public void kill() {
        super.kill();
    }
}

class Gerbil extends Rodent {
    @Override
    public void kill() {
        System.out.println("do not kill it");
    }
}

class Hamster extends Rodent {
    @Override
    public void kill() {
        System.out.println("shoot it");
    }
}

public class Test {
    public static void main(String[] args) {
        List<Rodent> rodents = new ArrayList<>();
        Random random = new Random(47);
        for (int i = 0; i < random.nextInt(3); i++) {
            switch (i % 3) {
                case 1: rodents.add(new Gerbil());break;
                case 2: rodents.add(new Hamster());break;
                default: rodents.add(new Mouse());
            }
        }

        Iterator<Rodent> iterator = rodents.iterator();
        while (iterator.hasNext()) {
            iterator.next().kill();
//            Rodent next = iterator.next();
//            next.kill();
        }
    }
}
