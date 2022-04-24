package com.example.designmode.observeprattern;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-04-24 15:59
 **/

public abstract class MySubject {

    protected List observers = new ArrayList();

    /**
     * 注册方法
     *
     * @param observer
     */
    public void attach(MyObserver observer) {
        observers.add(observer);
    }

    /**
     * 注销方法
     *
     * @param observer
     */
    public void detach(MyObserver observer) {
        observers.remove(observer);
    }

    /**
     * 抽象通知方法
     */
    public abstract void cry();

}
