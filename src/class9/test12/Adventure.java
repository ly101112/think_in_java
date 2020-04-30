/**
 * 第九章练习12 多重继承
 */
package class9.test12;

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fiy();
}

interface CanClimb {
    void climb();
}

class ActionCharacter{
    public void fight() {
        System.out.println(getClass().getSimpleName() + " fight");
    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {
    @Override
    public void fiy() {
        System.out.println(getClass().getSimpleName() + " fly");
    }

    @Override
    public void swim() {
        System.out.println(getClass().getSimpleName() + " swim");
    }

    @Override
    public void climb() {
        System.out.println(getClass().getSimpleName() + " climb");
    }
}

public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }
    public static void u(CanSwim x) {
        x.swim();
    }
    public static void v(CanFly x) {
        x.fiy();
    }
    public static void x(CanClimb x) {
        x.climb();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        t(hero);
        v(hero);
        u(hero);
        x(hero);
        w(hero);
    }
}
