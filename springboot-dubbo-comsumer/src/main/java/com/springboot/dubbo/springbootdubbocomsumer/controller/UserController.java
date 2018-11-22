package com.springboot.dubbo.springbootdubbocomsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springboot.dubbo.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Reference(version = "1.0.0", check = false, async = false, timeout = 5000)
  UserService userService;

  @RequestMapping("/say")
  public String say(@RequestParam(value = "name", defaultValue = "tyo") String name) {
    String ret = userService.say(name);
    return ret;
  }
}
