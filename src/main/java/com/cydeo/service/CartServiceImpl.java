package com.cydeo.service;

import com.cydeo.model.Cart;
import com.cydeo.model.Product;
import com.cydeo.repository.CartRepository;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Component
public class CartServiceImpl implements CartService{

    private CartRepository cartRepository;
    private StockService stockService;

    public CartServiceImpl(CartRepository cartRepository, StockService stockService) {
        this.cartRepository = cartRepository;
        this.stockService = stockService;
    }


    @Override
    public Cart addCart(Product product, int quantity) {

        if (!stockService.checkStockIsAvailable(product, quantity)) return null;

        Cart cart = new Cart();

        cartRepository.addCartDatabase(product, quantity);

        BigDecimal totalAmount = product.getPrice().multiply(new BigDecimal(quantity));

        Map<Product,Integer> products = new HashMap<>();

        products.put(product, quantity);

        cart.setCartTotalAmount(totalAmount);
        cart.setProductMap(products);

        return cart;

    }
}
