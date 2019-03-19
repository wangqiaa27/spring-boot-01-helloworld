package com.wangqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @SpringBootApplication 来标注一个spring boot主程序类
 */
//@ImportResource 导入Spring的配置文件
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        //spring 应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
