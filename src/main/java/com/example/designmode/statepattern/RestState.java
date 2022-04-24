package com.example.designmode.statepattern;

/**
 * <h3>design-mode</h3>
 * <p>下班休息状态</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-04-24 15:21
 **/

public class RestState extends State {
    @Override
    public void writeProgram(Work w) {
        System.err.println("当前时间: 下班回家了。" + w.getHour() + "点");
    }
}
