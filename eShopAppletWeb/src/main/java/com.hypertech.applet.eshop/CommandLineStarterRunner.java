package com.hypertech.applet.eshop;

import com.hypertech.applet.eshop.order.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineStarterRunner implements CommandLineRunner {

    @Autowired
    private OrderVO orderVO;


    public void run(String... args) throws Exception {
        System.out.println(orderVO.getOrder());
    }
}
