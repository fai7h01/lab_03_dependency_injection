package service;

import model.Cart;
import model.Product;

public interface CartService {
    Cart cart(Product product, int quantity);
}
