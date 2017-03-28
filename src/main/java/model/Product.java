package model;

/**
 * Created by Ondřej Soukup on 28.03.2017.
 */
public class Product{
    private int id, minStock;
    private String name, countryOrigin, description;
    private double costPrice, salesPrice, rentPrice;

    public Product(int id, String name, double costPrice, double salesPrice, double rentPrice, String countryOrigin, int minStock, String description){
        this.id = id;
        this.name = name;
        this.costPrice = costPrice;
        this.salesPrice = salesPrice;
        this.rentPrice = rentPrice;
        this.countryOrigin = countryOrigin;
        this.minStock = minStock;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public int getMinStock() {
        return minStock;
    }

    public String getName() {
        return name;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public String getDescription() {
        return description;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public double getRentPrice() {
        return rentPrice;
    }
}
