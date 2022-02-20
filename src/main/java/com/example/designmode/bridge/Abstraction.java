package com.example.designmode.bridge;

/**
 * <h3>design-mode</h3>
 * <p>抽象化角色类，它声明了一个方法operation()，并给出了它的实现。这个实现是通过向实现化对象的委派(调用operationImpl()方法)实现的。  </p>
 *
 * @author : ZhangYuJie
 * @date : 2022-02-20 15:20
 **/

public abstract class Abstraction {
    protected Implementor impl;

    public Abstraction(Implementor impl) {
        this.impl = impl;
    }

    /**
     * 示例方法
     */
    public void operation() {
        impl.operationImpl();
    }
}
