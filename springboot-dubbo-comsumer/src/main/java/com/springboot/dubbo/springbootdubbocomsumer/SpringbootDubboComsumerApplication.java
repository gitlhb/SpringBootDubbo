package com.springboot.dubbo.springbootdubbocomsumer;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
/*@ImportResource(locations= {"classpath:spring-dubbo.xml"})*/
public class SpringbootDubboComsumerApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootDubboComsumerApplication.class, args);
  }
}
