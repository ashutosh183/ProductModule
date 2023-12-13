package com.example.ashutosh.cart.controllers;

import com.example.ashutosh.cart.models.Product;
import com.example.ashutosh.cart.repo.ProductStore;
import com.example.ashutosh.cart.searcher.ProductSearcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class Cart {
    @Autowired
    ProductSearcher productSearcher;
    @Autowired
    ProductStore productStore;
    @RequestMapping(method = RequestMethod.GET, path="/product/{id}")
    public Product getProductById(@PathVariable int id){
        System.out.println("Searching By ID "+id);
        Product prodcut = productSearcher.searchById(id);
        return prodcut;
    }

    @RequestMapping(method = RequestMethod.GET, path="product/by/name")
    public List<Product> getProductByName(@RequestParam("name")String name){
        System.out.println(name);
        List<Product>products = productSearcher.searchByName(name);
        return products;
    }

    @RequestMapping(method = RequestMethod.GET, path="product/by/brand")
    public List<Product> getProductByBrand(@RequestParam("brand")String brand){
        System.out.println(brand);
        List<Product>products = productSearcher.searchByBrand(brand);
        return products;
    }

    @RequestMapping(method = RequestMethod.POST, path="/product/add")
    public String addProduct(Product product){
        productStore.addProduct(product);
        return "Product has been added";
    }
}
