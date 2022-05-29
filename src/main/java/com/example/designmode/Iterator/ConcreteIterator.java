package com.example.designmode.Iterator;


/**
 * <h3>design-mode</h3>
 * <p>迭代器角色(Concrete Iterator)</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-05-29 14:53
 **/

public class ConcreteIterator implements Iterator {
    private List list;
    private int index;

    public ConcreteIterator(List list) {
        super();
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index >= list.getSize()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object object = list.get(index);
        index++;
        return object;
    }
}
