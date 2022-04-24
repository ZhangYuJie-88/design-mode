package com.example.designmode.statepattern;

/**
 * <h3>design-mode</h3>
 * <p>晚间工作状态</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-04-24 15:18
 **/

public class EveningState extends State {
    @Override
    public void writeProgram(Work w) {
        if (w.getFinish()) {
            w.setState(new RestState());
            w.writeProgram();
        } else {
            if (w.getHour() < 21) {
                System.err.println("当前时间:加班哦，疲累" + w.getHour() + "点");
            } else {
                w.setState(new SleepingState());
                w.writeProgram();
            }

        }
    }
}
