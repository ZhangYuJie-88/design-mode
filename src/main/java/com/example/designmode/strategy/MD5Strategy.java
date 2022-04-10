package com.example.designmode.strategy;

/**
 * <h3>design-mode</h3>
 * <p>MD5加密</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-04-10 16:08
 **/

public class MD5Strategy implements Strategy{
    @Override
    public void encrypt() {
        System.out.println("执行MD5加密");
    }
}
