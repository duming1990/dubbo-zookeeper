package com.duming.service;

import com.sun.corba.se.spi.orb.ParserImplBase;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service //放到容器中
public class UserInfoService {
    //想拿到provider-server提供的用户，要去注册中心拿到服务
    @Reference //引用， pom坐标，可以定义相同的接口名
    UserService USER_SERVICE;

    public void getUser(){
        USER_SERVICE.getUsers();
        System.out.println("在注册中心拿到用户=>"+USER_SERVICE.getUsers());
    }
}
