package com.example.designmode.statepattern;

/**
 * <h3>design-mode</h3>
 * <p>上午工作状态</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-04-24 15:14
 **/

public class ForenoonState extends State {
    @Override
    public void writeProgram(Work w) {

        if (w.getHour() < 12) {
            System.err.println("当前时间:上午" + w.getHour() + "点");
        } else {
            w.setState(new NoonState());
            w.writeProgram();
        }
    }
}
