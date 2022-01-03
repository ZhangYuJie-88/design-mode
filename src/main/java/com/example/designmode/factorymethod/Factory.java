package com.example.designmode.factorymethod;

    /**
     * <h3>design-mode</h3>
     * <p>抽象工厂</p>
     *
     * @author : ZhangYuJie
     * @date : 2022-01-03 16:23
     **/
    public interface Factory {
        /**
         * 创建发送功能
         * @return
         */
        public Sender create();
    }
