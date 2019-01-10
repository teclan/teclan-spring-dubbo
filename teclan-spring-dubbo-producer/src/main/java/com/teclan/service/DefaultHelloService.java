package com.teclan.service;

import com.alibaba.dubbo.config.annotation.Service;


/**
 * @ClassName: DefaultHelloService
 * @Description: TODO
 * @Author: Teclan
 * @Date: 2019/1/10 14:36
 **/
// 注意是 dubbo的@Server注解
@Service(group = "server1")
public class DefaultHelloService implements  HelloService {

    @Override
    public String hello(String name) {
        return String.format("hello %s , I'm dubbo from server1",name);
    }
}
