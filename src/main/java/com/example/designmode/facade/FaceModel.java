package com.example.designmode.facade;

/**
 * <h3>design-mode</h3>
 * <p>对外面的情况</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-03-13 19:35
 **/

public class FaceModel {
    private FaceInterface faceInterface = new FaceIml();

    public void deal(String name, int num) {
        faceInterface.fight(name);
        faceInterface.giveTang(num);
    }
}
