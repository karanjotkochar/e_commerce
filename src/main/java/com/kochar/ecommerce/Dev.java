package com.kochar.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired // Field injection
    private Laptop laptop;

    // Constructor injection
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }

    // Setter injection
//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build() {

        laptop.compile();
        System.out.println("Begin project");
    }
}
