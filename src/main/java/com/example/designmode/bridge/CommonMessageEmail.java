package com.example.designmode.bridge;

/**
 * <h3>design-mode</h3>
 * <p>邮件消息示例类</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-02-20 15:28
 **/

public class CommonMessageEmail implements Message {

    @Override
    public void send(String message, String toUser) {
        System.out.println("使用邮件短消息的方法，发送消息'" + message + "'给" + toUser);
    }
}
