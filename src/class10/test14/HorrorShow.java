/**
 * 第十章练习14 内部类修改HorrorShow.java,用匿名类实现DangerousMonster和Vampire
 */
package class10.test14;

interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements DangerousMonster {
    @Override
    public void destroy() {

    }

    @Override
    public void menace() {

    }
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {
    @Override
    public void drinkBlood() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void kill() {

    }

    @Override
    public void menace() {

    }
}

public class HorrorShow {
    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    DangerousMonster dangerousMonsterMaker() {
        return new DangerousMonster() {
            @Override
            public void destroy() {

            }

            @Override
            public void menace() {

            }
        };
    }

    static void w(Lethal l) {
        l.kill();
    }

    Vampire vampireMaker() {
        return new Vampire() {
            @Override
            public void drinkBlood() {

            }

            @Override
            public void destroy() {

            }

            @Override
            public void kill() {

            }

            @Override
            public void menace() {

            }
        };
    }

    public static void main(String[] args) {
        HorrorShow horrorShow = new HorrorShow();
        u(horrorShow.dangerousMonsterMaker());
        v(horrorShow.dangerousMonsterMaker());
        u(horrorShow.vampireMaker());
        v(horrorShow.vampireMaker());
        w(horrorShow.vampireMaker());
    }
}
