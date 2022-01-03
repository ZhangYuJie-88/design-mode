package com.example.designmode.factorymethod;

/**
 * <h3>design-mode</h3>
 * <p>工厂模式测试类</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-01-03 15:58
 **/

public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory=new SendFactory();
        Sender sender = factory.produce(SendTypeEnum.MAIL);
        sender.send();
    }
}
