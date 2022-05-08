package com.example.designmode.memento;

/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-05-08 19:16
 **/

public class Originator {
    /**
     * 示意，表示原发器的状态
     */
    private String state = "";

    /**
     * 创建备忘录，保存原发器的状态
     *
     * @return 创建好的备忘录对象
     */
    public Memento createMemento() {
        return new MementoImpl(state);
    }

    /**
     * 将原发器恢复到备忘录中保存的状态
     * 保存有原发器状态的备忘录对象
     * @param
     */
    public void recoverFromMemento(Memento memento) {
        MementoImpl mementoImpl = (MementoImpl) memento;
        this.state = mementoImpl.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 真正的备忘录对象，实现了备忘录窄接口 实现成私有的内部类，不让外部访问
     */
    private static class MementoImpl implements  Memento {

        /**
         * 示意，表示需要保存的状态
         */
        private String state = "";

        public MementoImpl(String state) {
            super();
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }

}
