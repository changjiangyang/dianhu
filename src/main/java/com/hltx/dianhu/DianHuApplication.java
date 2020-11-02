package com.hltx.dianhu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description: 项目启动类
 * @author: ycj
 * @create: 2020-11-02 12:11
 **/
@SpringBootApplication
@MapperScan("com.hltx.dianhu.mapper")
@EnableDiscoveryClient
public class DianHuApplication {
    public static void main(String[] args) {
        SpringApplication.run(DianHuApplication.class, args);
    }
}
