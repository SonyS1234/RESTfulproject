package com.example.restservice.model;

public class Address {
    private int number;
    String streetName;
    String postCode;

    @Override
    public String toString() {
        return "Address{" +
                "number=" + number +
                ", streetName='" + streetName + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Address(int number, String streetName, String postCode) {
        this.number = number;
        this.streetName = streetName;
        this.postCode = postCode;
    }
}