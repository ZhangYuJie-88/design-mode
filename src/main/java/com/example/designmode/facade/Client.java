package com.example.designmode.facade;

/**
 * <h3>design-mode</h3>
 * <p>使用场景</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-03-13 19:36
 **/

public class Client {
    public static void main(String[] args) {
        FaceModel faceModel = new FaceModel();
        String name = "liaowp";
        //并不关心里面怎么打的，只知道要打那个人。这就是门面      假如现在打完之后怕报复，又给了一块糖，只需要修改接口那边就可以了。
        faceModel.deal(name, 1);
    }
}
