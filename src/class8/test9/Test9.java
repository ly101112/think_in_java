/**
 * 第八章练习9
 */
package class8.test9;

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

public class Test9 {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster(),
        };
        for (Rodent rodent:rodents) {
            rodent.kill();
        }
    }
}
