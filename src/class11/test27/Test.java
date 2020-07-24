/**
 * 第十一章练习27 Queue队列
 */
package class11.test27;

import java.util.LinkedList;
import java.util.Queue;

class Command {
    public String s;

    public Command(String s) {
        this.s = s;
    }

    public void operation() {
        System.out.println(s);
    }
}

class CommandQueue {
    private Queue<Command> queue = new LinkedList<Command>();

    public void addCommand(Command command) {
        queue.offer(command);
    }

    public Queue<Command> getQueue() {
        return queue;
    }
}

class Use {
    public void useCommand(Queue queue) {
        while (queue.peek() != null) {
            ((Command) queue.remove()).operation();
        }
    }
}

public class Test {
    public static void main(String[] args) {
        CommandQueue commandQueue = new CommandQueue();
        commandQueue.addCommand(new Command("aaa"));
        commandQueue.addCommand(new Command("bbb"));
        commandQueue.addCommand(new Command("ccc"));
        commandQueue.addCommand(new Command("ddd"));
        commandQueue.addCommand(new Command("eee"));
        commandQueue.addCommand(new Command("fff"));

        Use use = new Use();
        use.useCommand(commandQueue.getQueue());
    }
}
