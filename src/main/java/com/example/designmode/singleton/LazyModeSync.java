package com.example.designmode.singleton;

/**
 * <h3>design-mode</h3>
 * <p>懒汉式（双重同步锁）</p>
 *
 * @author : ZhangYuJie
 * @date : 2021-12-26 15:23
 **/
public class LazyModeSync {
    private static volatile LazyModeSync instance = null;

    private LazyModeSync() {
    }

    /**
     * 运行时加载对象
     * @return
     */
    public static LazyModeSync getInstance() {
        if (instance == null) {
            synchronized (LazyModeSync.class) {
                if (instance == null) {
                    instance = new LazyModeSync();
                }
            }
        }
        return instance;
    }
}
