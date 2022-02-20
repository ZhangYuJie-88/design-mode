package com.example.designmode.bridge;

/**
 * <h3>design-mode</h3>
 * <p>加急消息类</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-02-20 15:49
 **/

public class UrgentMessage extends AbstractMessage {

    public UrgentMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "加急：" + message;
        super.sendMessage(message, toUser);
    }

    /**
     * 扩展自己的新功能，监控某消息的处理状态
     *
     * @param messageId 被监控的消息编号
     * @return 监控到的消息的处理状态
     */
    public Object watch(String messageId) {
        // 根据消息id获取消息的状态，组织成监控的数据对象，然后返回
        return null;
    }
}
