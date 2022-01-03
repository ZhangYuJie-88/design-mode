package com.example.designmode.factorymethod;

/**
 * <h3>design-mode</h3>
 * <p>发送短信类</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-01-03 15:50
 **/

public class SmsSender implements Sender{
    @Override
    public void send() {
        System.err.println("发送短信");
    }
}
