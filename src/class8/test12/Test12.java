/**
 * 第八章练习12 修改练习9，展示初始化顺序
 */
package class8.test12;

class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }
}

class Description {
    private String s;

    Description(String s) {
        this.s = s;
        System.out.println("Creating Description " + s);
    }
}

class Rodent {
    Characteristic characteristic = new Characteristic("Rodent");
    Description description = new Description("Rodent");

    Rodent() {
        System.out.println("Rodent()");
    }

    public void kill() {
        System.out.println("kill it!!");
    }
}

class Mouse extends Rodent {
    Characteristic characteristic = new Characteristic("Mouse");
    Description description = new Description("Mouse");

    Mouse() {
        System.out.println("Mouse()");
    }

    @Override
    public void kill() {
        super.kill();
    }
}

class Gerbil extends Rodent {
    Characteristic characteristic = new Characteristic("Gerbil");
    Description description = new Description("Gerbil");

    Gerbil() {
        System.out.println("Gerbil()");
    }

    @Override
    public void kill() {
        System.out.println("do not kill it");
    }
}

class Hamster extends Rodent {
    Characteristic characteristic = new Characteristic("Hamster");
    Description description = new Description("Hamster");

    Hamster() {
        System.out.println("Hamster()");
    }

    @Override
    public void kill() {
        System.out.println("shoot it");
    }
}

public class Test12 {
    Test12() {
        System.out.println("Test12");
    }

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
