package com.example.designmode.factorymethod;

/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-01-03 16:25
 **/

public class FactoryTest1 {
    public static void main(String[] args) {
        Factory smsFactory = new SmsFactory();
        // 发送短信
        Sender smsSender = smsFactory.create();
        smsSender.send();
        // 发送邮件
        Factory mailFactory = new MailFactory();
        Sender mailSender = mailFactory.create();
        mailSender.send();
    }
}
