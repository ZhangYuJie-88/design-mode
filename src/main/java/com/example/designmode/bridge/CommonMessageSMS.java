package com.example.designmode.bridge;

/**
 * <h3>design-mode</h3>
 * <p>系统内短消息示例类</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-02-20 15:27
 **/

public class CommonMessageSMS implements Message {

    @Override
    public void send(String message, String toUser) {
        System.out.println("使用系统内短消息的方法，发送消息'" + message + "'给" + toUser);
    }
}
