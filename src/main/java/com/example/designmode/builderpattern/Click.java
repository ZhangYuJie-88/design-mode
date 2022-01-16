package com.example.designmode.builderpattern;

/**
 * <h3>design-mode</h3>
 * <p>客户端使用</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-01-16 22:09
 **/

public class Click {
    public static void main(String[] args) {
        // 非 Builder 模式
        Computer computer = new Computer("cpu", "screen", "memory", "mainboard");
        // Builder 模式
        NewComputer newComputer = new NewComputer.Builder()
                .cpu("cpu")
                .screen("screen")
                .memory("memory")
                .mainboard("mainboard")
                .build();
    }
}
