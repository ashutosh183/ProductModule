package com.example.ashutosh.cart.searcher;

import com.example.ashutosh.cart.models.Product;

import java.util.List;

public interface Searcher {
    Product searchById(int id);
    List<Product> searchByName(String name);
    List<Product> searchByBrand(String brand);
    List<Product> searchByAll(int id, String name, String brand);

}
