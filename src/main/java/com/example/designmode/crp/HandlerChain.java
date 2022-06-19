package com.example.designmode.crp;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <h3>design-mode</h3>
 * <p>定义一个处理接口的链</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-06-19 19:11
 **/

public class HandlerChain implements Handler.Chain {
    /**
     * 持有链要处理的请求
     */
    private final Request request;
    /**
     * 持有链上所有的处理器
     */
    private Queue<Handler> handlers;

    public HandlerChain(Request request) {
        this.request = request;
    }

    /**
     * <h3>design-mode</h3>
     * <p>添加处理器</p>
     * @param handler
     * @return
     */
    public HandlerChain addHandler(Handler handler) {
        if (handlers == null) {
            handlers = new LinkedList<>();
        }
        handlers.add(handler);
        return this;
    }

    /**
     * 实现接口的方法- 获取请求
     * @return
     */
    public Request request() {
        return request;
    }

    /**
     * 实现接口的方法- 处理请求
     * @param request
     * @return
     */
    public Result proceed(Request request) {
        // 取队首的处理器开始请求。如果队首的处理器处理了，直接返回结果
        // 如果队首的处理器选择传递请求，又会进这个proceed方法。取新的队首处理
        // 为什么是传递而不是直接遍历队列，如果result = null,继续；result != null，返回呢？ 因为传递的方式，可以对request再次处理。A处理器可以做简单处理，再传递给B。
        Handler handler = handlers.poll();
        assert handler != null;
        return handler.deal(this);
    }
}
