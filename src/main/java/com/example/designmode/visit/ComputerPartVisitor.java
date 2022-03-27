package com.example.designmode.visit;


/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-03-27 17:50
 **/

public interface ComputerPartVisitor {
    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

    void visit(Computer computer);
}
