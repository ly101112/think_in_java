/**
 * 第十章练习17 匿名类工厂模式抛硬币和骰子游戏
 */
package class10.test17;

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

    public static GameFactory getGameFactory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Coin();
        }
    };
}

class Dice implements Game {
    Random random = new Random();

    @Override
    public void play() {
        System.out.println("数字为：" + (random.nextInt(6) + 1));
    }

    public static GameFactory getGameFactory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Dice();
        }
    };
}

public class Games {
    public static void play(GameFactory gameFactory) {
        Game game = gameFactory.getGame();
        game.play();
    }

    public static void main(String[] args) {
        play(Coin.getGameFactory);
        play(Dice.getGameFactory);
    }
}
