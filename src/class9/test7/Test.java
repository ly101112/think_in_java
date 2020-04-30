/**
 * 第九章练习7 修改第八章练习9Rodent为接口
 */
package class9.test7;

interface Rodent {
    void kill();
}

class Mouse implements Rodent {
    @Override
    public void kill() {
        System.out.println("kill it");
    }
}

class Gerbil implements Rodent {
    @Override
    public void kill() {
        System.out.println("do not kill it");
    }
}

class Hamster implements Rodent {
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
