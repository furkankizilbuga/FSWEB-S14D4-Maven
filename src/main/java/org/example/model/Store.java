package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale chocolate = new Chocolate("Bitter", 5, "Ülker", "a");
        ProductForSale coke = new Coke("Şekersiz", 5, "Pepsi", "b");
        ProductForSale bread = new Bread("Kepekli", 10, "Halk Ekmek", "c");

        ProductForSale[] products = { chocolate, coke, bread };

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}