package com.example.designmode.interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * <h3>design-mode</h3>
 * <p>终结符表达式</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-06-05 13:18
 **/

public class TerminalExpression implements Expression {

    private Set<String> set = new HashSet<String>();

    public TerminalExpression(String[] data) {
        for (int i = 0; i < data.length; i++) {
            set.add(data[i]);
        }
    }

    /**
     * 对终结符表达式的处理
     *
     * @param info
     * @return
     */
    @Override
    public boolean interpret(String info) {
        if (set.contains(info)) {
            return true;
        }
        return false;
    }
}
