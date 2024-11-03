/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author P51
 */
public class Customer implements Comparable<Customer>{
    private String id, name, address, buyDateString, warrantyDateString;
    private Product product;
    private int numBuys;
    private Date buyDate, warrantyDate;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Customer(String id, String name, String address, Product product, int numBuys, String dateString) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.product = product;
        this.numBuys = numBuys;
        this.buyDateString = dateString;
        try {
            this.buyDate = dateFormat.parse(dateString);
        } catch (Exception e) {
            
        }
        this.warrantyDateString = calWarrantyDate();
        try {
            this.warrantyDate = dateFormat.parse(warrantyDateString);
        } catch (Exception ex) {
            
        }
    }
    private String calWarrantyDate(){
        String a[] = buyDateString.trim().split("/");
        int month = Integer.parseInt(a[1]);
        int year = Integer.parseInt(a[2]);
        int newMonths = month + product.getWarrantyMonths();
        year += newMonths / 12;
        month = newMonths % 12;
        return String.format("%s/%02d/%04d", a[0], month, year);
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + address + " " + product + " " + numBuys * product.getPrice() + " " + dateFormat.format(warrantyDate);
    }

    @Override
    public int compareTo(Customer o) {
        int dateCmp = this.warrantyDate.compareTo(o.warrantyDate);
        if (dateCmp == 0) {
            return this.id.compareTo(o.id);
        }
        return dateCmp;
    }
}
