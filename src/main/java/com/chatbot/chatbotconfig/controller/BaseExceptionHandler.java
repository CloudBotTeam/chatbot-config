package com.chatbot.chatbotconfig.controller;

import com.chatbot.chatbotconfig.entity.Result;
import com.chatbot.chatbotconfig.entity.StatusCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author: Chen Yulei
 * @since: 2018-12-12
 **/
@RestControllerAdvice
public class BaseExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public Result exception(Exception e) {
        e.printStackTrace();
        return new Result(StatusCode.ERROR, e.getMessage());
    }
}
