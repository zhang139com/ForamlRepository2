package com.springboot.test.springScheduleTask;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;


@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
public class SaticScheduleTask {

    //3.添加定时任务
    @Scheduled(cron = "${job.cron}")//将值放在放在配置文件中
    private void configureTasks() {
        System.out.println("执行spring自带定时任务时间: " + new Date().toString());
    }
}