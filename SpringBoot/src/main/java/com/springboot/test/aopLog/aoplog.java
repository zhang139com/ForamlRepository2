package com.springboot.test.aopLog;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;

@Aspect
@Component
public class aoplog {
    private  static final Logger logger = LoggerFactory.getLogger(aoplog.class);

    @Pointcut("execution(* com.springboot.test.Controler..*.*(..))")
    public void pointcut(){}

    @Before(value = "pointcut()")
    public void before(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        logger.info("URL:"+request.getRequestURI().toString());
        logger.info("Method:"+request.getMethod());
        logger.info("Ip:"+request.getRemoteAddr());
        Enumeration<String> paramer =  request.getParameterNames();
        while(paramer.hasMoreElements()){
            String name = (String)paramer.nextElement();//调用nextElement方法获得元素
            String value = request.getParameter(name);
            logger.info("name"+name+"value"+value);
        }
    }

}
