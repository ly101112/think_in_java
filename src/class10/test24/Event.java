/**
 * 第十章练习24 内部类与控制框架--事件定义
 * System.nanoTime() 为纳秒事件
 * System.currentTimeMillis() 修改时间控制为毫秒
 */
package class10.test24;

public abstract class Event {
    private long eventTime;
    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() {
        eventTime = System.currentTimeMillis() + delayTime;
    }

    public boolean ready() {
        return System.currentTimeMillis() >= eventTime;
    }

    public abstract void action();
}
