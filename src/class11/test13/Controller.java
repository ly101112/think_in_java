/**
 * 第十一章练习13 修改第十章练习25 内部类与控制框架--控制器定义
 * 修改List为LinkedList 改为迭代器循环
 */
package class11.test13;

import class10.test24.Event;

import java.util.*;

public class Controller {
    private LinkedList<Event> eventList = new LinkedList<>();

    public void addEvent(Event event) {
        eventList.add(event);
    }

    public void run() {
        LinkedList<Event> eventCopy = new LinkedList<>(eventList);
        ListIterator<Event> iterator = eventCopy.listIterator();
//        while (eventList.size() > 0) {
//            // 进行复制，以便在选择列表中的元素时不会修改列表，避开报错
//            for (Event e : new ArrayList<Event>(eventList)) {
//                if (e.ready()) {
//                    System.out.println(e);
//                    e.action();
//                    eventList.remove(e);
//                }
//            }
//        }

        // 迭代器顺序执行，不会重复执行
        while (iterator.hasNext()) {
            // 自己的流程
            if (iterator.next().ready()) {
                iterator.next().action();
                iterator.remove();
            }

            // 答案上的流程
//            System.out.println("ready: " + iterator.next().ready());
//            iterator.next().action();
//            iterator.previous();
//            System.out.println(iterator.next());
        }
    }
}
