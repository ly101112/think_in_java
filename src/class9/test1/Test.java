/**
 * 第九章练习1 修改第八章练习9中Rodent为抽象类
 */
package class9.test1;

abstract class Rodent {
    abstract public void kill();
}

class Mouse extends Rodent {
    @Override
    public void kill() {
        System.out.println("kill it");
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
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster(),
        };
        for (Rodent rodent : rodents) {
            rodent.kill();
        }
    }
}
