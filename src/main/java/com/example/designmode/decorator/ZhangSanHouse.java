package com.example.designmode.decorator;

/**
 * <h3>design-mode</h3>
 * <p>具体的房子：ZhangSanHouse</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-03-06 14:16
 **/

public class ZhangSanHouse implements House {
    @Override
    public void output() {
        System.out.println("这是张三的房子");
    }
}
