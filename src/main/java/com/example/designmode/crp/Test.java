package com.example.designmode.crp;

/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-06-19 19:13
 **/

public class Test {
    public static void main(String[] args) {
        // new 一个链，往链上添加处理器
        Request request1 = new Request("ZYJ", 3);
        HandlerChain chains = new HandlerChain(request1)
                .addHandler(new AHandler())
                .addHandler(new BHandler())
                .addHandler(new CHandler());
        Result result1 = chains.proceed(request1);
        System.out.println("结果：" + result1.isAgree());
    }
}
