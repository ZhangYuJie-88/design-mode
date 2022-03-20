package com.example.designmode.flyweightpattern;

/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-03-20 15:38
 **/

public class Test {
    public static void main(String[] args) {
        IToys iToys1 = ToysFactory.getInstance().getIToysInstance(1);
        iToys1.setColor("red");
        System.out.println(iToys1 + "---" + iToys1.getSize() + "---" + iToys1.getColor());

        IToys iToys2 = ToysFactory.getInstance().getIToysInstance(1);
        iToys1.setColor("blue");
        System.out.println(iToys2 + "---" + iToys2.getSize() + "---" + iToys2.getColor());

        IToys iToys3 = ToysFactory.getInstance().getIToysInstance(1);
        iToys1.setColor("yellow");
        System.out.println(iToys3 + "---" + iToys3.getSize() + "---" + iToys3.getColor());
    }
}
