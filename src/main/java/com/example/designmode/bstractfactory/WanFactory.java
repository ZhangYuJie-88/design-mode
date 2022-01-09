package com.example.designmode.bstractfactory;

/**
 * <h3>design-mode</h3>
 * <p>绘图的工厂子类</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-01-09 20:27
 **/

public class WanFactory implements AbstractFactory{

    @Override
    public Graph createGraph(String createType) {
        Graph graph = null;
        if ("circle".equals(createType)) {
            graph = new WanCircle();
        } else if ("rectangle".equals(createType)) {
            graph = new WanRectangle();
        }
        return graph;
    }
}
