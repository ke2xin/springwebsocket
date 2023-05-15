package com.example.springwebsocket.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class WebSocketTimer {//https://blog.csdn.net/nhx900317/article/details/119731779

    private static final Logger log = LoggerFactory.getLogger(WebSocket.class);

    /**
     * 心跳，每5分钟一次 @Scheduled(cron = "0 0/5 * * * ?")
     * 心跳，每2秒一次 @Scheduled(cron="0/2 * * * * ?")
     */
    @Bean
    @Scheduled(cron="0/2 * * * * ?")
    public void WebSocketHeartBeat() {
        log.info("WebSocketHeartBeat 心跳机制");
        //WebSocket.sendMessageToAll("HeartBeat", "");
    }

    /**
     * 检测Session是否还在连接状态，每5分钟一次
     * 在心跳发出的1分钟后执行
     */
    @Bean
    @Scheduled(cron = "0 1/5 * * * ?")
    public void WebSocketCheckSession() {
        log.info("WebSocketCheckSession");
        //WebSocket.checkSession();
    }
}
