package com.example.designmode.observeprattern;

/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-04-24 16:17
 **/

public class Client {
    public static void main(String[] args) {
        MySubject subject = new Cat();

        MyObserver obs1, obs2, obs3, obs4;
        obs1 = new Mouse();
        obs2 = new Mouse();
        obs3 = new Dog();
        obs4 = new Pig();
        subject.attach(obs1);
        subject.attach(obs2);
        subject.attach(obs3);
        subject.attach(obs4);
        subject.cry();
    }

}
