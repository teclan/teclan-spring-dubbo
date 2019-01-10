package com.teclan.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.teclan.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Description: TODO
 * @Author: Teclan
 * @Date: 2019/1/10 14:43
 **/
@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(String name){
        return helloService.hello(name);
    }
}
