package com.teclan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @ClassName: Main
 * @Description: TODO
 * @Author: Teclan
 * @Date: 2019/1/10 14:28
 **/
@SpringBootApplication(scanBasePackages="com.teclan",exclude = DataSourceAutoConfiguration.class)
//@EnableScheduling
//@PropertySource(value = { "application.yml"})// 指定读取配置文件的路径
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
