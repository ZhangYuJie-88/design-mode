package com.example.designmode.singleton;

/**
 * <h3>design-mode</h3>
 * <p>懒汉模式</p>
 *
 * @author : ZhangYuJie
 * @date : 2021-12-26 15:19
 **/
public class LazyMode {
    /**
     * 线程不安全的
     */
    private static LazyMode lazymode = null;

    private LazyMode() {
    }

    /**
     * 运行时加载对象
     *
     * @return
     */
    public static LazyMode getInstance() {
        if (lazymode == null) {
            lazymode = new LazyMode();
        }
        return lazymode;
    }
}
