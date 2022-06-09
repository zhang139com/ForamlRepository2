package com.springboot.test;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

//@EnableAutoConfiguration
//@ComponentScan("com.SpringBoot")
@SpringBootApplication
@MapperScan("com.springboot.test.inter")
public class Applicationapp {

    /* 第二种分页方式需要在springboot的启动类（Application.java)里面注入配置
       @Bean
        PageHelper pageHelper(){
            //分页插件
            PageHelper pageHelper = new PageHelper();
            Properties properties = new Properties();
            properties.setProperty("reasonable", "true");
            properties.setProperty("supportMethodsArguments", "true");
            properties.setProperty("returnPageInfo", "check");
            properties.setProperty("params", "count=countSql");
            pageHelper.setProperties(properties);
            //添加插件
            new SqlSessionFactoryBean().setPlugins(new Interceptor[]{pageHelper});
            return pageHelper;
        }*/
    public static void main(String[] args) {
        SpringApplication.run(Applicationapp.class, args);
    }
}
