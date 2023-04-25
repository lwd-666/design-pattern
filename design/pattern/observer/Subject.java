package design.pattern.observer;

/**
 * 抽象主题
 */
public interface Subject {
    /**
     * 添加观察者
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 减少观察者
     * @param observer
     */
    void detach(Observer observer);

    /**
     * 通知观察者
     * @param message
     */
    void notify(String message);
}
