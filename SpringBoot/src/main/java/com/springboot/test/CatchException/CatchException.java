package com.springboot.test.CatchException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/*表示全局捕获异常类*/
@ControllerAdvice
@RestController
public class CatchException {
/*    @ExceptionHandler(Exception.class)
    public String resulterror(){
        return "你发生了错误";
    }*/
}
