package models;

import interfaces.ProductService;

import java.util.ArrayList;

public class Product {

    private String productCategory;
    private String productName;
    private String productId;
    private double productPrice;
    private int unitsInStock;


    public Product(String productCategory, String productName, String productId, double productPrice, int unitsInStock) {
        this.productCategory = productCategory;
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
        this.unitsInStock = unitsInStock;
    }

    public Product() {

    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCategory='" + productCategory + '\'' +
                ", productName='" + productName + '\'' +
                ", productId='" + productId + '\'' +
                ", productPrice=" + productPrice +
                ", unitsInStock=" + unitsInStock +
                '}';
    }

}

