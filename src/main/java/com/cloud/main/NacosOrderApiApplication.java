package com.cloud.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//开启hystrix支持
@EnableHystrix
//实现服务注册
@EnableDiscoveryClient
//@EnableCaching //缓存
@RefreshScope
@MapperScan("com.cloud.dao")
@SpringBootApplication(scanBasePackages = {"com.cloud"})
public class NacosOrderApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosOrderApiApplication.class, args);
    }

}
