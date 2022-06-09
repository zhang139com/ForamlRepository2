package com.springboot.test.quartz;

//import org.quartz.*;
//import org.quartz.impl.StdSchedulerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        //创建scheduler
//        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
//        Scheduler scheduler = schedulerFactory.getScheduler();
//
//        //创建TestJob的JobDetail实例，并设置name
//        JobDetail jobDetail = JobBuilder.newJob(TestJob.class).withIdentity("testDetail").build();
//
//        //cron表达式，每秒执行一次
//        String cron = "0/1 * * * * ? ";
//        //创建Trigger触发器,使用cronSchedule方式调度
//        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("testTrigger").withSchedule(CronScheduleBuilder.cronSchedule(cron)).build();
//
//        //注册JobDetail实例到scheduler,并使用对应的trigger触发
//        scheduler.scheduleJob(jobDetail, trigger);
//        //启动scheduler
//        scheduler.start();
    }
}