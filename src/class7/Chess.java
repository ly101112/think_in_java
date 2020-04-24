package class7;

/**
 * 第七章练习6 造器只会调用父类的默认构造器，如果不是没有默认构造器，必须显式调用父类的构造器
 */
public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess chess = new Chess();
    }
}

class Game{
    Game(int i){
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        System.out.println("BoardGame constructor");
    }
}
