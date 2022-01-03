package com.example.designmode.factorymethod;

/**
 * <h3>design-mode</h3>
 * <p>发送邮件</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-01-03 15:51
 **/

public class MailSender implements Sender {

    @Override
    public void send() {
        System.err.println("发送邮件");
    }
}
