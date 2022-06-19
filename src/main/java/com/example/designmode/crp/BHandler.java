package com.example.designmode.crp;

public class BHandler implements Handler {
    public Result deal(Chain chain) {
        Request request = chain.request();
        // 只处理小于等于2的请求，大于2的请求被传递了
        if (request.getDays() > 2) {
            return chain.proceed(request);
        }
        System.out.println("B处理了");
        return new Result(true);
    }
}
