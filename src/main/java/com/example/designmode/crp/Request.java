package com.example.designmode.crp;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <h3>design-mode</h3>
 * <p>定义一个请求</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-06-19 19:09
 **/
@Data
@AllArgsConstructor
public class Request {
    private String name;

    private int days;

}
