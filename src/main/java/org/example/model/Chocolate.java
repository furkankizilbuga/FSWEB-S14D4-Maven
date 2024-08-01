package org.example.model;

public class Chocolate extends ProductForSale {

    private String a;

    public Chocolate(String type, double price, String description, String a) {
        super(type, price, description);
        this.a = a;
    }

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Çikolata detay: " + a);
    }


}
