package com.example.designmode.facade;

/**
 * <h3>design-mode</h3>
 * <p>具体实现方式</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-03-13 19:34
 **/

public class FaceIml implements FaceInterface {
    /**
     * 打架
     */
    @Override
    public void fight(String name) {
        System.out.println("打了" + name);
    }

    /**
     * 给糖
     *
     * @param num
     */
    @Override
    public void giveTang(int num) {
        System.out.println("不能报复，给你" + num + "块糖");
    }
}
