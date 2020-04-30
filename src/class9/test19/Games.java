/**
 * 第九章练习19 工厂模式抛硬币和骰子游戏
 */
package class9.test19;

import java.util.Random;

interface Game {
    void play();
}

interface GameFactory {
    Game getGame();
}

class Coin implements Game {
    Random random = new Random();

    @Override
    public void play() {
        if (random.nextInt(2) % 1 == 0)
            System.out.println("正面");
        else
            System.out.println("反面");
    }
}

class CoinFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Coin();
    }
}

class Dice implements Game {
    Random random = new Random();

    @Override
    public void play() {
        System.out.println("数字为：" + (random.nextInt(6) + 1));
    }
}

class DiceFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Dice();
    }
}

public class Games {
    public static void play(GameFactory gameFactory) {
        Game game = gameFactory.getGame();
        game.play();
    }

    public static void main(String[] args) {
        play(new CoinFactory());
        play(new DiceFactory());
    }
}
