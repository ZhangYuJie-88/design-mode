package com.example.designmode.interpreter;

/**
 * <h3>design-mode</h3>
 * <p>非终结符表达式类</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-06-05 13:18
 **/

public class AndExpression implements Expression {
    private Expression city;
    private Expression person;

    public AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    /**
     * 非对终结符表达式的处理
     *
     * @param info
     * @return
     */
    @Override
    public boolean interpret(String info) {
        String s[] = info.split("的");
        //判断city是否包含存入的信息 && person是否包含存入的信息
        return city.interpret(s[0]) && person.interpret(s[1]);
    }

}
