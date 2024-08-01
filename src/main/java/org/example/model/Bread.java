package org.example.model;

public class Bread extends ProductForSale {

    private String c;

    public Bread(String type, double price, String description, String c) {
        super(type, price, description);
        this.c = c;
    }

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Ekmek detay: " + c);
    }
}
