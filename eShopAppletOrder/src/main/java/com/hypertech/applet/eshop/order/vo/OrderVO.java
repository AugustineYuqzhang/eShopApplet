package com.hypertech.applet.eshop.order.vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class OrderVO {

    @Value("${order.name}")
    private String order;

}
