package com.example.designmode.bridge;

/**
 * <h3>design-mode</h3>
 * <p>修正抽象化角色</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-02-20 15:22
 **/

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    /**
     * 其他的操作方法
     */
    public void otherOperation() {

    }
}
