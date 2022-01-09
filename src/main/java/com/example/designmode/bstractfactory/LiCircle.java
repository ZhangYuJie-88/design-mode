package com.example.designmode.bstractfactory;

/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-01-09 20:39
 **/

public class LiCircle  extends Graph {
    @Override
    public void startDraw() {
        System.out.println("李开始绘制圆形...");
    }

    @Override
    public void finishDraw() {
        System.out.println("李结束绘制圆形...");
        System.out.println("-------------------");
    }
}
