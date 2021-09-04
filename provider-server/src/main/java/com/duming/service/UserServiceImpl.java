package com.duming.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

//zookeeper:服务注册与发现
@Service    //可以被扫描到，在项目一启动就自动注册到注册中心
@Component //使用了dubbo后尽量不要用@Service注解
public class UserServiceImpl implements UserService {
    @Override
    public String getUsers() {
        return "明神在世！";
    }
}
