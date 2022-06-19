package com.example.designmode.crp;

/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-06-19 19:10
 **/

public interface Handler {
    /**
     * 每个处理器持有链，能取到链上的请求或者传递请求
     * @param chain
     * @return
     */
    Result deal(Chain chain);

    interface Chain {
        /**
         * 获取请求
         * @return
         */
        Request request();

        /**
         * 传递请求
         * @param request
         * @return
         */
        Result proceed(Request request);
    }
}
