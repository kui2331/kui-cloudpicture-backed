package com.kui2331.kuiCloudPictureBacked;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.kui2331.kuiCloudPictureBacked.mybatis.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class KuiCloudPictureBackedApplication {
    public static void main(String[] args) {
        SpringApplication.run(KuiCloudPictureBackedApplication.class, args);
    }

}
