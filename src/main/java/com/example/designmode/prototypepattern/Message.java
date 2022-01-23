package com.example.designmode.prototypepattern;

import java.io.*;
import java.util.Date;

/**
 * <h3>design-mode</h3>
 * <p>消息类</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-01-23 16:39
 **/

public class Message implements Cloneable, Serializable {
    private String name;  //消息名称
    private String size;  //消息大小
    private int type;     //消息类型
    private Date date;    //创建日期

    public static final int TEXT = 0x01;
    public static final int PIC = 0x02;
    public static final int VIDEO = 0x03;
    public static final int MIX = 0x04;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public Message clone() throws CloneNotSupportedException {
        return (Message) super.clone();
    }

    public Message deepClone() throws CloneNotSupportedException,
            IOException, ClassNotFoundException {
        //把对象写入到字节流中
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);

        //把字节流转化为对象
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return (Message) ois.readObject();
    }

    @Override
    public String toString() {
        String tos = "name[" + name + "]，size[" + size +
                "]，type[" + type + "]，date[" + date + "]";
        return tos;
    }

    public static void main(String[] a) {
        Message msg = new Message();
        msg.setName("好友消息");
        msg.setSize("123KB");
        msg.setType(Message.TEXT);
        msg.setDate(new Date());

        System.out.println("msg：" + msg.toString());

        try {
            Message cloneMsg = msg.deepClone();

            System.out.println("msg：" + msg.toString());
            System.out.println("cloneMsg：" + cloneMsg.toString());
            System.out.println(cloneMsg.getDate() == msg.getDate());
            System.out.println(cloneMsg.getName() == msg.getName());
            System.out.println(cloneMsg.getType() == msg.getType());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
