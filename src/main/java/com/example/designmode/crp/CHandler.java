package com.example.designmode.crp;

public class CHandler implements Handler {
    public Result deal(Chain chain) {
        Request request = chain.request();
        // 只处理小于等于3的请求，大于3的请求被传递了
        if (request.getDays() > 3) {
            return chain.proceed(request);
        }
        System.out.println("C处理了");
        return new Result(true);
    }
}
