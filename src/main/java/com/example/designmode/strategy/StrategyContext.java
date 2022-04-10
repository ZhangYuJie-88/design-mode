package com.example.designmode.strategy;

/**
 * <h3>design-mode</h3>
 * <p>策略模式封装类</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-04-10 16:10
 **/

public class StrategyContext {

    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void encrypt() {
        this.strategy.encrypt();
    }
}
