package com.example.designmode.singleton;

/**
 * <h3>design-mode</h3>
 * <p>饿汉模式</p>
 *
 * @author : ZhangYuJie
 * @date : 2021-12-26 15:07
 **/
public class HungryMode {
    /**
     * 线程安全的
     * 类初始化时，立即加载这个对象
     */
    private static HungryMode hungry = new HungryMode();

    private HungryMode() {

    }

    /**
     * 方法没有加同步块，所以它效率高
     * @return
     */
    public static HungryMode getInstance() {
        return hungry;
    }
}
