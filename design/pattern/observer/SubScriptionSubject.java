package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author soft
 * @version 1.0
 * @description: 具体的主题角色类
 * @date 2023/4/25 19:27
 */
public class SubScriptionSubject implements Subject {
    private static List<Observer> list = new ArrayList<Observer>();
    /**
     * 添加观察者
     * @param observer
     */
    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    /**
     * 减少观察者
     * @param observer
     */
    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    /**
     * 通知观察者
     * @param message
     */
    @Override
    public void notify(String message) {
        for (Observer observer : list) {
            observer.update(message);
        }
    }
}
