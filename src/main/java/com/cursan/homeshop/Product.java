package com.cursan.homeshop;

public class Product {
    private String name;
    private String description;
    private double price;

    /**
     * Display a full description of the product
     */

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Product() {

    }

    /**
     * Add the product to a Bill
     *
     * @param bill     the concerned bill
     * @param quantity the quantity to add
     */
    public void buy(Bill bill, Integer quantity) {

    }

    public void look() {
        System.out.println(String.format(name + " : " + price + "%n" + description));
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
