/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;


public class Product {
    private String productName;
    private String productColor;
    private String productCategory;
    private int productStock;
    private double productWeight;
    private String productDescription;

    
    public Product(String productName, String productColor, String productCategory, int productStock, double productWeight, String productDescription) {
        this.productName = productName;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.productStock = productStock;
        this.productWeight = productWeight;
        this.productDescription = productDescription;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }


public void orderProduct(int quantity) {

    if (quantity <= productStock) {
        productStock -= quantity;
        if (quantity == 1) {
            System.out.println(quantity + " " + productName + " ordered.");
        } else {
            System.out.println(quantity + " " + productName + "s ordered.");
        }
        System.out.println("Remaining stock: " + productStock);
    } else {
        System.out.println("Insufficient stock for " + quantity + " " + productName + "(s).");
    }
}
    public void displayProductProperties() {
        System.out.println("-Product Name: " + productName);
        System.out.println("-Product Color: " + productColor);
        System.out.println("-Product Category: " + productCategory);
        System.out.println("-Product Stock: " + productStock);
        System.out.println("-Product Weight: " + productWeight + " kg");
        System.out.println("-Product Description: " + productDescription);
    }
    
    @Override
    public String toString() {
        // return String.format("Product Name: %s, Product Color: %s", this.productName, this.productColor);
        return this.productName;
    }
}
