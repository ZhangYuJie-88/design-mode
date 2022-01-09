package com.example.designmode.bstractfactory;

/**
 * <h3>design-mode</h3>
 * <p>绘制圆形</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-01-09 20:28
 **/

public class WanCircle extends Graph {
    @Override
    public void startDraw() {
        System.out.println("万开始绘制圆形...");
    }

    @Override
    public void finishDraw() {
        System.out.println("万结束绘制圆形...");
        System.out.println("-------------------");
    }
}
