package com.example.designmode.factorymethod;

/**
 * <h3>design-mode</h3>
 * <p>工厂类</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-01-03 15:52
 **/
public class SendFactory {
    /**
     * 生产者
     *
     * @param sendTypeEnum
     * @return
     */
    public Sender produce(SendTypeEnum sendTypeEnum) {
        switch (sendTypeEnum) {
            case MAIL:
                return new MailSender();
            case SMS:
                return new SmsSender();
            default:
                System.err.println("类型错误");
                return null;
        }
    }

}
