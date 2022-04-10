package com.example.designmode.strategy;

/**
 * <h3>design-mode</h3>
 * <p>策略模式客户端调用</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-04-10 16:11
 **/

public class StrategyMain {
    public static void main(String[] args) {
        StrategyContext context = new StrategyContext(new MD5Strategy());
        context.encrypt();
        context=new StrategyContext(new SHA1Strategy());
        context.encrypt();
    }
}
