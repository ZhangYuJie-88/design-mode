package com.example.designmode.memento;

/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-05-08 19:16
 **/

public class Caretaker {

    /**
     * 记录被保存的备忘录对象
     */
    private Memento memento = null;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
