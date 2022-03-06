package com.example.designmode.decorator;

/**
 * <h3>design-mode</h3>
 * <p>代理模式</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-03-06 14:23
 **/

public class Proxy implements House {
    private House house;
    public  Proxy(){
        this.house = new ZhangSanHouse();
    }
    @Override
    public void output() {
        System.out.println("这是针对目标的前段增强");
        house.output();
        System.out.println("这是针对目标的后段增强");
    }
}
