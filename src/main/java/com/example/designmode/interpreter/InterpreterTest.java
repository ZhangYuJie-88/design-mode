package com.example.designmode.interpreter;

/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-06-05 13:20
 **/

public class InterpreterTest {
    public static void main(String[] args) {
        Context bus = new Context();
        bus.freeRide("深圳的老人");
        bus.freeRide("上海的年轻人");
        bus.freeRide("北京的妇女");
        bus.freeRide("广州的小孩");
        bus.freeRide("山东的小孩");
    }

}
