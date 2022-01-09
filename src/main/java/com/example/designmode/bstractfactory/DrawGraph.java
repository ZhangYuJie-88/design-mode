package com.example.designmode.bstractfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h3>design-mode</h3>
 * <p>绘图的工具类</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-01-09 20:29
 **/

public class DrawGraph {

    AbstractFactory factory;

    /**
     * 构造方法
     * @param factory
     */
    public DrawGraph(AbstractFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbstractFactory factory) {
        Graph graph;
        String createType = "";
        this.factory = factory;
        do {
            createType = getType();
            // factory可能是小万的工厂子类，也可能是小李的工厂子类
            graph = factory.createGraph(createType);
            if (graph != null) {
                graph.startDraw();
                graph.finishDraw();
            }else {
                System.out.println("输入有误，您已退出！");
                break;
            }

        }while (true);

    }

    // 获取绘制者绘制的图形形状
    private String getType() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入需要绘制的图形形状：");
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
