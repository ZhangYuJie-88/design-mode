package com.example.designmode.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-03-20 15:37
 **/

public class ToysFactory {

    //存储共享对象
    private Map<Integer, IToys> cacheMap = new HashMap<>();

    private static ToysFactory instance = null;
    private ToysFactory(){}

    public static ToysFactory getInstance(){
        if (null == instance){
            synchronized (ToysFactory.class){
                if (null == instance){
                    instance = new ToysFactory();
                }
            }
        }
        return instance;
    }

    public IToys getIToysInstance(int size){

        IToys iToys = cacheMap.get(size);
        if (null == iToys){
            iToys = new SpecificToys(size);
            cacheMap.put(size, iToys);
        }
        return iToys;
    }
}
