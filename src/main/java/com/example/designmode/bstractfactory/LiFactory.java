package com.example.designmode.bstractfactory;

/**
 * <h3>design-mode</h3>
 * <p>绘图的工厂子类</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-01-09 20:31
 **/

public class LiFactory implements AbstractFactory {
    @Override
    public Graph createGraph(String createType) {
        Graph graph = null;
        if ("circle".equals(createType)) {
            graph = new LiCircle();
        }else if ("rectangle".equals(createType)) {
            graph = new LiRectangle();
        }
        return graph;
    }
}
