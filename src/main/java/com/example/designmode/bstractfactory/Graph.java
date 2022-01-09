package com.example.designmode.bstractfactory;

/**
 * <h3>design-mode</h3>
 * <p>图形抽象类</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-01-09 20:24
 **/

public abstract  class Graph {
    /**
     * 开始绘制
     */
    public abstract void startDraw();

    /**
     * 结束绘制
     */
    public abstract void finishDraw();
}
