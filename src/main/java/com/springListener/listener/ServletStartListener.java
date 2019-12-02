package com.springListener.listener;

import com.springListener.util.TestListener;
import org.apache.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 服务器启动监听器
 */
public class ServletStartListener implements ServletContextListener {
    private static final Logger log = Logger.getLogger(ServletStartListener.class);

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        log.info("服务器启动监听器");
        TestListener.testListener1();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }
}
