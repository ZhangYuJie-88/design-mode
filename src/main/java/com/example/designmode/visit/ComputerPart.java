package com.example.designmode.visit;

/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-03-27 17:50
 **/

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
