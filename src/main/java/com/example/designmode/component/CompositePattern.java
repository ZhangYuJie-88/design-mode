package com.example.designmode.component;

/**
 * <h3>design-mode</h3>
 * <p>通过 Component 接口操作结构中的对象。</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-02-27 16:04
 **/

public class CompositePattern {

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite compX = new Composite("Composite X");
        compX.add(new Leaf("Leaf XA"));
        compX.add(new Leaf("Leaf XB"));
        root.add(compX);

        Composite compXY = new Composite("Composite XY");
        compXY.add(new Leaf("Leaf XYA"));
        compXY.add(new Leaf("Leaf XYB"));
        compX.add(compXY);

        root.display(1);
    }
}
