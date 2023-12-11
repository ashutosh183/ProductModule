package com.example.ashutosh.cart.searcher;

import com.example.ashutosh.cart.models.Product;
import com.example.ashutosh.cart.repo.ProductStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
public class ProductSearcher implements Searcher{
    @Autowired
    ProductStore productStore;
    @Override
    public Product searchById(int id) {
        HashMap<Integer, Product> products = productStore.getProducts();
        for(Map.Entry<Integer, Product> product: products.entrySet()){
            if(product.getValue().getId() == id){
                return product.getValue();
            }
        }
        return new Product(0, "", 0, 0.0, "", "");
    }

    @Override
    public List<Product> searchByName(String name) {
        return null;
    }

    @Override
    public List<Product> searchByBrand(String brand) {
        return null;
    }

    @Override
    public List<Product> searchByAll(int id, String name, String brand) {
        return null;
    }
}
