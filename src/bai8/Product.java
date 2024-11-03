/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

/**
 *
 * @author P51
 */
public class Product {
    private String productId, productName;
    private int price, warrantyMonths;

    public Product(String productId, String productName, int price, int warrantyMonths) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public int getPrice() {
        return price;
    }

    public String getProductId() {
        return productId;
    }
    
    @Override
    public String toString(){
        return productId;
    }
    
}
