package com.example.designmode.factorymethod;

/**
 * <h3>design-mode</h3>
 * <p>静态工厂方法模式</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-01-03 16:12
 **/

public class SendFactory2 {
    /**
     * 生产邮件对象
     *
     * @return
     */
    public static Sender produceMail() {
        return new MailSender();
    }

    /**
     * 生产短信对象
     *
     * @return
     */
    public static Sender produceSms() {
        return new SmsSender();
    }
}
