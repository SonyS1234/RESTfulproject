package com.example.restservice;

public class Soda {
    String brand;
    String flavour;

    public Soda (String brand, String flavour){
        this.brand = brand;
        this.flavour = flavour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "Soda{" +
                "brand='" + brand + '\'' +
                ", flavour='" + flavour + '\'' +
                '}';
    }
}