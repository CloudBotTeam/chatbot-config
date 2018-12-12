package com.chatbot.chatbotconfig.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Chen Yulei
 * @since: 2018-12-12
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    //状态码
    private Integer code;

    //状态消息
    private String message;

    //返回的数据
    private Object data;

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
