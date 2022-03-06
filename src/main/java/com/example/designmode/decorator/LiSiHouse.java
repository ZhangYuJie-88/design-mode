package com.example.designmode.decorator;

/**
 * <h3>design-mode</h3>
 * <p>李四的房子</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-03-06 14:20
 **/

public class LiSiHouse implements House {
    @Override
    public void output() {
        System.out.println("这是李四的房子");
    }
}
