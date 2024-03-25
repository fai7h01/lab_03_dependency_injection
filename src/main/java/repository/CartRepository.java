package repository;

import model.Product;

public interface CartRepository {
    boolean addCartDatabase(Product product, int quantity);
}
