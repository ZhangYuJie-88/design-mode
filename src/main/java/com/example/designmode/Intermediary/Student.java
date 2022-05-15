package com.example.designmode.Intermediary;

/**
 * <h3>design-mode</h3>
 * <p>同事类</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-05-15 14:39
 **/
public class Student {
    private String name;
    private String sex;

    public Student(String name, String sex) {

        this.name = name;
        this.sex = sex;
        Mediator.add(this);
    }

    public String getSex() {
        return sex;
    }

    public String getName() {

        return name;
    }

    public void sendMessageToAll(String message) {
        Mediator.sendMessageToAll(this, message);
    }

    public void sendMessageToSameSex(String message) {
        Mediator.sendMessageToSameSex(this, message);
    }

    public void receiveMessage(String message) {
        System.out.println(name + "收到了消息。" + message);
    }

}
