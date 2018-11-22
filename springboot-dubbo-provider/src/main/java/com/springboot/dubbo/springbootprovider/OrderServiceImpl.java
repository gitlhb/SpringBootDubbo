package com.springboot.dubbo.springbootprovider;

import com.alibaba.dubbo.config.annotation.Service;
import com.springboot.dubbo.OrderService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Service(version = "1.0.0", timeout = 5000, interfaceClass = OrderService.class)
public class OrderServiceImpl implements OrderService {
  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");

  @Override
  public String getOrderId() {
    Integer hc = UUID.randomUUID().hashCode();
    if (hc < 0) {
      hc = hc * (-1);
    }
    return simpleDateFormat.format(new Date()) + hc;
  }
}
