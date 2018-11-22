package com.springboot.dubbo.springbootprovider;

import com.alibaba.dubbo.config.annotation.Service;
import com.springboot.dubbo.UserService;

import java.util.Date;

@Service(version = "1.0.0",timeout = 5000,interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
  public String say(String name) {
    return name + new Date().getTime() + "";
  }
}
