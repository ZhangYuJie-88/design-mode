package com.example.designmode.bridge;

/**
 * <h3>design-mode</h3>
 * <p>加急消息的接口</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-02-20 15:30
 **/

public interface UrgencyMessage extends Message {
    /**
     * 监控指定消息的处理过程
     *
     * @param messageId 被监控的消息编号
     * @return 监控到的消息的处理状态
     */
    Object watch(String messageId);
}
