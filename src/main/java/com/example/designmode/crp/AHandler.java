package com.example.designmode.crp;

/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-06-19 19:11
 **/

public class AHandler implements Handler {
    public Result deal(Chain chain) {
        Request request = chain.request();
        // 只处理小于等于1的请求，大于1的请求被传递了
        if (request.getDays() > 1) {
            // 这里可以对request做部分处理，再传递
            return chain.proceed(request);
        }
        System.out.println("A处理了");
        return new Result(true);
    }
}

