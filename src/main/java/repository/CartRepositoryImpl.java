package repository;

import model.Product;

public class CartRepositoryImpl implements CartRepository{

    @Override
    public boolean addCartDatabase(Product product, int quantity) {
        System.out.println(product.getName() + " is added to database");
        return true;
    }
}
