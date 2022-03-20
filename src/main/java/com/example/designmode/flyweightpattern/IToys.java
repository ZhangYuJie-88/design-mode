package com.example.designmode.flyweightpattern;

/**
 * <h3>design-mode</h3>
 * <p>抽象出享元对象接口</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-03-20 15:34
 **/

public interface  IToys {
    void setColor(String color);

    int getSize();

    String getColor();
}
