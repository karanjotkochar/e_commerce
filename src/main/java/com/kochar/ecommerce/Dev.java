package com.kochar.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired // Field injection
    private Laptop laptop;

    public void build() {

        laptop.compile();
        System.out.println("Begin project");
    }
}
