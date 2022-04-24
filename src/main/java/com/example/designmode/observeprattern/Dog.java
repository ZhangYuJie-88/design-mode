package com.example.designmode.observeprattern;

/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-04-24 16:05
 **/

public class Dog implements MyObserver {
    @Override
    public void response() {
        System.out.println("狗跟着叫!");
    }
}
