package com.example.designmode.bstractfactory;

/**
 * <h3>design-mode</h3>
 * <p>抽象工厂模式的顶级抽象层</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-01-09 20:24
 **/

public interface AbstractFactory {
    /**
     * 定义一个创建图形的方法，让其子类具体实现
     * @param createType
     * @return
     */
    Graph createGraph(String createType);
}
