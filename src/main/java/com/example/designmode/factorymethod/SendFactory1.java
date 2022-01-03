package com.example.designmode.factorymethod;

/**
 * <h3>design-mode</h3>
 * <p>多工厂方法模式</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-01-03 16:09
 **/

public class SendFactory1 {
    /**
     * 生产邮件短信对象
     *
     * @return
     */
    public Sender produceMail() {
        return new MailSender();
    }

    /**
     * 生产短信对象
     *
     * @return
     */
    public Sender produceSms() {
        return new SmsSender();
    }
}
