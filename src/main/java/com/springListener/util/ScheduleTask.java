package com.springListener.util;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 定时任务
 */
@Component
public class ScheduleTask {
    private static final Logger log = Logger.getLogger(ScheduleTask.class);

    @Scheduled(cron="0/5 * *  * * ? ")
    public static void testScheduleTask(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        String dateStr=sdf.format(date);

        System.out.println("1---"+dateStr);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Scheduled(cron="0/5 * *  * * ? ")
    public static void testScheduleTask1(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        String dateStr=sdf.format(date);

        System.out.println("2---"+dateStr);
    }
}
