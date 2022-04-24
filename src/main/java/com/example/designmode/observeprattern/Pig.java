package com.example.designmode.observeprattern;

/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-04-24 16:19
 **/

public class Pig implements MyObserver {
    @Override
    public void response() {
        System.out.println("猪没有反应!");
    }
}
