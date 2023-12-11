package com.example.ashutosh.cart.models;

public class Product {
    private int id;
    private String name;
    private int stock;
    private double price;
    private String brand;
    private String category;

    public Product(int id, String name, int stock, double price, String brand, String category){
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.brand = brand;
        this.category = category;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }
}
