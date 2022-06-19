package com.example.designmode.crp;

import lombok.Data;

/**
 * <h3>design-mode</h3>
 * <p>定义一个返回结果</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-06-19 19:10
 **/
@Data
public class Result {
    private boolean agree;

    public Result(boolean agree) {
        this.agree = agree;
    }
}
