package com.springListener.listener;

import com.springListener.util.ScheduleTask;
import com.springListener.util.TestListener;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * spring启动监听器
 */
public class SpringContextListener implements ApplicationListener<ContextRefreshedEvent> {

    private static final Logger log = Logger.getLogger(SpringContextListener.class);

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        log.info("spring启动监听器");
        TestListener.testListener();
        ScheduleTask.testScheduleTask();
    }
}
