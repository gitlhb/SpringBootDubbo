package com.springboot.dubbo.springbootdubbocomsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springboot.dubbo.OrderService;
import com.springboot.dubbo.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootDubboComsumerApplication.class)
public class Test {
  @Reference(version = "1.0.0", interfaceClass = UserService.class, timeout = 5000)
  UserService userService;

  @Reference(version = "1.0.0", check = false, timeout = 5000, interfaceClass = OrderService.class,async = false)
  OrderService orderService;

  @org.junit.Test
  public void test() {
    String a = userService.say("9999");
    System.out.println("a:" + a);
    log.info("=========a:" + a);
  }

  @org.junit.Test
  public void testOrder() {
    String orderId = orderService.getOrderId();
    log.info("---------------------" + orderId);
  }
}
