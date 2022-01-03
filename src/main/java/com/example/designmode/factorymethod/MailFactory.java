package com.example.designmode.factorymethod;

/**
 * <h3>design-mode</h3>
 * <p>邮件工厂</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-01-03 16:24
 **/

public class MailFactory implements  Factory{
    @Override
    public Sender create() {
        return new MailSender();
    }
}
