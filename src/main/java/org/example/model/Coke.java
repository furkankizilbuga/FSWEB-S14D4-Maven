package org.example.model;

public class Coke extends ProductForSale {

    private String b;

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public Coke(String type, double price, String description, String b) {
        super(type, price, description);
        this.b = b;
    }

    @Override
    public void showDetails() {
        System.out.println("Kola detay: " + b);
    }
}
