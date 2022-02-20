package com.example.designmode.bridge;

/**
 * <h3>design-mode</h3>
 * <p>客户端类</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-02-20 15:51
 **/

public class Client {
    public static void main(String[] args) {
        //创建具体的实现对象
        MessageImplementor impl = new MessageSMS();
        //创建普通消息对象
        AbstractMessage message = new CommonMessage(impl);
        message.sendMessage("加班申请速批", "李总");

        //将实现方式切换成邮件，再次发送
        impl = new MessageEmail();
        //创建加急消息对象
        message = new UrgentMessage(impl);
        message.sendMessage("加班申请速批", "李总");
    }
}
