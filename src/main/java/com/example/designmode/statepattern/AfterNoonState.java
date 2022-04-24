package com.example.designmode.statepattern;

/**
 * <h3>design-mode</h3>
 * <p>下午工作状态</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-04-24 15:36
 **/

public class AfterNoonState extends State {
    @Override
    public void writeProgram(Work w) {

        if (w.getHour() < 13) {
            System.err.println("当前时间:下午" + w.getHour() + "点");
        } else {
            w.setState(new EveningState());
            w.writeProgram();
        }
    }
}
