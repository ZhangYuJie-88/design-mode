package com.example.designmode.builderpattern;

import lombok.Data;

/**
 * <h3>design-mode</h3>
 * <p>非build模式示例类</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-01-16 22:10
 **/
@Data
public class Computer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;
    public Computer(String cpu, String screen, String memory, String mainboard) {
        this.cpu = cpu;
        this.screen = screen;
        this.memory = memory;
        this.mainboard = mainboard;
    }
}
