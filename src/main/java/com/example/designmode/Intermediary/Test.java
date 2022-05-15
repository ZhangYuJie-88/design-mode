package com.example.designmode.Intermediary;

/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-05-15 14:42
 **/

public class Test {
    public static void main(String[] args) {
        Student femaleA = new Student("小丽", "female");
        Student femaleB = new Student("小红", "female");
        Student femaleC = new Student("小美", "female");

        Student femaleD = new Student("小刚", "male");
        Student femaleE = new Student("小明", "male");
        Student femaleF = new Student("小达", "male");

        femaleA.sendMessageToAll("大家好，我叫小丽");
        femaleA.sendMessageToSameSex("舍友们，今天咱们去哪里吃饭？");

        femaleD.sendMessageToSameSex("走，去躺厕所。");
    }

}
