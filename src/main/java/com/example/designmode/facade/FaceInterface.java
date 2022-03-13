package com.example.designmode.facade;

/**
 * <h3>design-mode</h3>
 * <p>门面模式接口    打架不能让别人看见</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-03-13 19:33
 **/

public interface FaceInterface {
    /**
     * 跟谁打
     *
     * @param name
     */
    void fight(String name);

    /**
     * 给糖
     *
     * @param num
     */
    void giveTang(int num);
}
