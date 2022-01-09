package com.example.designmode.bstractfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h3>design-mode</h3>
 * <p>图形绘制者</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-01-09 20:30
 **/

public class DrawPerson {
    public static void main(String[] args) {
        System.out.println("请输入绘制者的姓名：");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name = reader.readLine();
            if ("xw".equals(name)) {
                new DrawGraph(new WanFactory());
            }else {
                new DrawGraph(new LiFactory());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
