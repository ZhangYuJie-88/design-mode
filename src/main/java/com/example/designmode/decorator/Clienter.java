package com.example.designmode.decorator;

/**
 * <h3>design-mode</h3>
 * <p>测试类</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-03-06 14:18
 **/

public class Clienter {
    public static void main(String[] args) {
        House zhangSanHouse = new ZhangSanHouse();
        House decorator = new Decorator(zhangSanHouse);
        decorator.output();
    }
}
