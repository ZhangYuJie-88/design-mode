package com.example.designmode.statepattern;

/**
 * <h3>design-mode</h3>
 * <p>睡眠状态</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-04-24 15:20
 **/

public class SleepingState extends State {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 13) {
            System.err.println("当前时间: 不行了，睡着了。" + w.getHour() + "点");
        }
    }
}
