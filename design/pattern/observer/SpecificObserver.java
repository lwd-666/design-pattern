package design.pattern.observer;

/**
 * @author soft
 * @version 1.0
 * @description: 具体观察者类
 * @date 2023/4/25 19:29
 */
public class SpecificObserver implements Observer {
    private String name;

    public SpecificObserver(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+"==>"+message);
    }
}
