/**
 * 第十二章练习20 异常继承
 */
package Class12.test29;

class BaseballException extends RuntimeException {}

class Foul extends BaseballException {}

class Strike extends BaseballException {}

class UmpireArgument extends BaseballException {}

class ThrownFromGame extends UmpireArgument {}

abstract class Inning {
    public Inning() throws BaseballException {}

    public void event() throws BaseballException {}

    public abstract void atBat() throws Strike, Foul;

    public void walk() {}

    public void msg() throws UmpireArgument {};
}

class StormException extends RuntimeException {}

class RainedOut extends StormException {}

class PopFoul extends Foul {}

interface Storm {
    public void event() throws RainedOut;

    public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {

    // 可以为构造函数添加新的异常，但必须处理基本的构造函数异常
    public StormyInning() throws BaseballException, RainedOut {}

    public StormyInning(String s) throws BaseballException, Foul {}

    // 常规方法必须符合基类
//    @Override
//    public void walk() throws PopFoul {}


    // 接口无法从基类向现有方法添加异常
//    @Override
//    public void event() throws RainedOut {}


    // 如果该方法在基类中尚不存在，则可以
    @Override
    public void rainHard() throws RainedOut {}

    // 可以选择不抛出任何异常，即使基类这么做了
    @Override
    public void event() {}

    // 重写的方法可以引发继承的异常
    @Override
    public void atBat() throws PopFoul {}

    @Override
    public void msg() throws UmpireArgument {
        throw new UmpireArgument();
    }

    public static void main(String[] args) {
//        try {
            StormyInning stormyInning = new StormyInning();
            stormyInning.atBat();
            stormyInning.msg();
//        } catch (UmpireArgument umpireArgument) {
//            umpireArgument.printStackTrace();
//        } catch (PopFoul popFoul) {
//            popFoul.printStackTrace();
//        } catch (RainedOut rainedOut) {
//            rainedOut.printStackTrace();
//        } catch (BaseballException e) {
//            // 基础的异常只能在后面
//            e.printStackTrace();
//        }

        // 未在衍生版本中抛出警告
//        try {
            // 向上转型
            Inning inning = new StormyInning();
            inning.atBat();
            inning.msg();
            // 必须处理从转型类里方法抛出的异常
//        } catch (ThrownFromGame thrownFromGame) { // 自动转型为基类方法抛出的异常类型
//            thrownFromGame.printStackTrace();
//        } catch (Strike strike) {
//            strike.printStackTrace();
//        } catch (Foul foul) {
//            foul.printStackTrace();
//        } catch (RainedOut rainedOut) {
//            rainedOut.printStackTrace();
//        } catch (BaseballException e) {
//            e.printStackTrace();
//        }
    }
}
