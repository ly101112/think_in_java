/**
 * 第八章练习14 修改练习12，展示初始化顺序，修改某个对象为具有引用计数的共享对象
 */
package class8.test14;

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

class Animal {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Animal() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    public void dispose() {
        if (--refcount == 0) {
            System.out.println("disposing " + this);
        }
    }

    public void showRef() {
        System.out.println("refcount = " + refcount);
    }

    @Override
    public String toString() {
        return "Animal " + id;
    }
}

class Rodent {
    private Animal animal;
    private Characteristic characteristic = new Characteristic("Rodent");
    private Description description = new Description("Rodent");

    Rodent(Animal animal) {
        System.out.println("Rodent()");
        this.animal = animal;
        this.animal.addRef();
    }

    public void dispose() {
        animal.dispose();
    }

    public void kill() {
        System.out.println("kill it!!");
    }
}

class Mouse extends Rodent {
    private Animal animal;
    private Characteristic characteristic = new Characteristic("Mouse");
    private Description description = new Description("Mouse");

    Mouse(Animal animal) {
        super(animal);
        System.out.println("Mouse()");
        this.animal = animal;
        this.animal.addRef();
    }

    @Override
    public void dispose() {
        super.dispose();
        animal.dispose();
    }

    @Override
    public void kill() {
        super.kill();
    }
}

class Gerbil extends Rodent {
    private Animal animal;
    private Characteristic characteristic = new Characteristic("Gerbil");
    private Description description = new Description("Gerbil");

    Gerbil(Animal animal) {
        super(animal);
        System.out.println("Gerbil()");
        this.animal = animal;
        this.animal.addRef();
    }

    @Override
    public void dispose() {
        super.dispose();
        animal.dispose();
    }

    @Override
    public void kill() {
        System.out.println("do not kill it");
    }
}

class Hamster extends Rodent {
    private Animal animal;
    private Characteristic characteristic = new Characteristic("Hamster");
    private Description description = new Description("Hamster");

    Hamster(Animal animal) {
        super(animal);
        System.out.println("Hamster()");
        this.animal = animal;
        this.animal.addRef();
    }

    @Override
    public void dispose() {
        super.dispose();
        animal.dispose();
    }

    @Override
    public void kill() {
        System.out.println("shoot it");
    }
}

public class Test14 {
    Test14() {
        System.out.println("Test12");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Rodent[] rodents = {
                new Mouse(animal),
                new Gerbil(animal),
                new Hamster(animal),
        };
        for (Rodent rodent : rodents) {
            rodent.kill();
//            rodent.dispose();
        }
        animal.showRef();
    }
}
