package com.example.ashutosh.cart.repo;

import com.example.ashutosh.cart.models.Product;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class ProductStore {
    HashMap<Integer, Product> products;
    ProductStore(HashMap<Integer, Product> products){
        this.products = new HashMap<>();
    }
    public String addProduct(Product product){
        if(products.containsKey(product)){
//            update();
        }
        products.put(product.getId(), product);
        return "Product has been added/updated successfully";
    }
    public HashMap<Integer, Product> getProducts(){
        return this.products;
    }
}
