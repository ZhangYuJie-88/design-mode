package com.example.designmode.flyweightpattern;

/**
 * <h3>design-mode</h3>
 * <p>具体享元对象：</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-03-20 15:35
 **/

public class SpecificToys implements IToys {
    private String color;
    private int size;

    public SpecificToys(int size) {
        this.size = size;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
