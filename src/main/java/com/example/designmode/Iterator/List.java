package com.example.designmode.Iterator;

/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-05-29 14:54
 **/

interface List {
    void add(Object obj);

    Object get(int index);

    Iterator iterator();

    int getSize();
}
