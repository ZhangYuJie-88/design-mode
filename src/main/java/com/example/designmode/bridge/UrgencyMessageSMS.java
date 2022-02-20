package com.example.designmode.bridge;

/**
 * <h3>design-mode</h3>
 * <p>系统内加急短消息示例类</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-02-20 15:31
 **/

public class UrgencyMessageSMS implements UrgencyMessage {

    @Override
    public Object watch(String messageId) {
        // 根据消息id获取消息的状态，组织成监控的数据对象，然后返回
        return null;
    }

    @Override
    public void send(String message, String toUser) {

        message = "加急：" + message;
        System.out.println("使用系统内短消息的方法，发送消息'" + message + "'给" + toUser);
    }
}
