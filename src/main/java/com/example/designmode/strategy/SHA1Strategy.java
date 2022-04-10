package com.example.designmode.strategy;

/**
 * <h3>design-mode</h3>
 * <p>SHA1加密</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-04-10 16:09
 **/

public class SHA1Strategy implements Strategy {
    @Override
    public void encrypt() {
        System.out.println("执行SHA1加密");
    }
}
