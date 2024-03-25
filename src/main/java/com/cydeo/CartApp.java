package com.cydeo;

import com.cydeo.config.ConfigApp;
import com.cydeo.model.Product;
import com.cydeo.service.CartService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

public class CartApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        Product product1 = new Product("iPhone Case", 10, 10, BigDecimal.valueOf(39));
        Product product2 = new Product("Google Case", 15, 15, BigDecimal.valueOf(29));

        CartService cartService = container.getBean(CartService.class);

        cartService.addCart(product1, 5);
        cartService.addCart(product2, 20);

    }
}
