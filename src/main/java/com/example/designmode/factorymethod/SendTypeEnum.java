package com.example.designmode.factorymethod;

/**
 * @author ZhangYuJie
 */

public enum SendTypeEnum {
    MAIL("mail"),
    SMS("sms");

    private String type;

    SendTypeEnum(String type) {
        this.type = type;
    }
}
