package com.example.designmode.bridge;

/**
 * <h3>design-mode</h3>
 * <p>实现发送消息的统一接口</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-02-20 15:50
 **/

public interface MessageImplementor {
    /**
     * 发送消息
     * @param message 要发送消息的内容
     * @param toUser  消息的接受者
     */
    public void send(String message , String toUser);
}
