package com.example.designmode.bstractfactory;

/**
 * <h3>design-mode</h3>
 * <p>绘制矩形</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-01-09 20:28
 **/

public class LiRectangle extends Graph {
    @Override
    public void startDraw() {
        System.out.println("李开始绘制矩形...");
    }

    @Override
    public void finishDraw() {
        System.out.println("李结束绘制矩形...");
        System.out.println("-------------------");
    }
}
