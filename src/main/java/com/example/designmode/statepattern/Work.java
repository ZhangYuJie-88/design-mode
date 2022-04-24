package com.example.designmode.statepattern;

import lombok.Data;

/**
 * <h3>design-mode</h3>
 * <p>工作状态－分类板</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-04-24 14:56
 **/
@Data
public class Work {
    private int hour;

    private Boolean finish = false;

    private State state;

    public Work() {
        state = new ForenoonState();
    }

    public static void main(String[] args) {
        //紧急项目
        Work emergencyProjects = new Work();
        emergencyProjects.hour = 9;
        emergencyProjects.writeProgram();
        emergencyProjects.hour = 10;
        emergencyProjects.writeProgram();
        emergencyProjects.hour = 12;
        emergencyProjects.writeProgram();
        emergencyProjects.hour = 13;
        emergencyProjects.writeProgram();
        emergencyProjects.hour = 14;
        emergencyProjects.writeProgram();
        emergencyProjects.hour = 17;
        emergencyProjects.writeProgram();

        //emergencyProjects.WorkFinished = true;
        emergencyProjects.finish = true;

        emergencyProjects.writeProgram();
        emergencyProjects.hour = 19;
        emergencyProjects.writeProgram();
        emergencyProjects.hour = 22;
        emergencyProjects.writeProgram();
    }

    public void writeProgram() {
        this.state.writeProgram(this);
    }

}
