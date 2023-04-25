package design.pattern.observer;

/**
 * @author soft
 * @version 1.0
 * @description: 观察者模式测试
 * @date 2023/4/25 19:30
 */
public class Client {
    public static void main(String[] args) {
        //定义被观察者
        Subject subject = new SubScriptionSubject();
        //添加观察者列表
        subject.attach(new SpecificObserver("李德翔"));
        subject.attach(new SpecificObserver("曹晓斌"));
        subject.attach(new SpecificObserver("王三石"));

        subject.notify("考上复旦研究生");
    }
}
