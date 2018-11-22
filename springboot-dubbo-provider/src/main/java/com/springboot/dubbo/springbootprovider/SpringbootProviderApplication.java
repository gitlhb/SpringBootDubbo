package com.springboot.dubbo.springbootprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableDubbo
@EnableDubboConfig
public class SpringbootProviderApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootProviderApplication.class, args);
  }
}
