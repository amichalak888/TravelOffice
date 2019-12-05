package com.company;

public class Address {
   private String street;
    private String zip;
    private String city;

    public Address(String street, String zip, String city) {
        this.street = street;
        this.zip = zip;
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString(Address address) {
        return "Ulica: "+ address.street+
                "kod pocztowy : " + address.zip+
                "miasto:  " + address.city;
    }
};

