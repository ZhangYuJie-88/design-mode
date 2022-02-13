package com.example.designmode.adapter;

/**
 * <h3>design-mode</h3>
 * <p>实现一个Type-c转VGA适配器，  *适配器实现方式有三种，这是第一种实现方式。</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-02-13 17:44
 **/

public class Typec2Vga1 extends Phone implements Vga {
    @Override
    public void vgaInterface() {
        // TODO Auto-generated method stub
        typecPhone();
        System.out.println("接收到Type-c口信息，信息转换成VGA接口中...");
        System.out.println("信息已转换成VGA接口，显示屏可以对接。");
    }
}
