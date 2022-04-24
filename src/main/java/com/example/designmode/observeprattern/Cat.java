package com.example.designmode.observeprattern;

/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-04-24 16:05
 **/

public class Cat extends MySubject {
    @Override
    public void cry() {
        System.out.println("猫叫!");
        System.out.println("-----------------------------------------");
        for (Object obs : observers) {
            ((MyObserver) obs).response();
        }
    }
}
