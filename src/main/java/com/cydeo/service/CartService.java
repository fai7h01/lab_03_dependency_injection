package com.cydeo.service;

import com.cydeo.model.Cart;
import com.cydeo.model.Product;

public interface CartService {
    Cart cart(Product product, int quantity);
}
