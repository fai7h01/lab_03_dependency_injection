package service;

import model.Product;

public interface StockService {
    boolean checkStockIsAvailable(Product product, int quantity);
}
