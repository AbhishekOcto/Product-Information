package com.bridgelabz.productInformation.entity;

public class Product {
    private int id;
    private String productName;
    private String batchNo;
    private double price;
    private int Quantity;

    //default constructor
    public Product() {}

    //constructor using fields
    public Product(int id, String productName, String batchNo, double price, int quantity) {
        this.id = id;
        this.productName = productName;
        this.batchNo = batchNo;
        this.price = price;
        Quantity = quantity;
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
