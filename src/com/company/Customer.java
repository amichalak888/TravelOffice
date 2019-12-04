package com.company;

public class Customer {
    String name;
    Address address;
    Trip trip;

    public Customer(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void assignTrip(Trip trip) {
        this.trip = trip;
    }
    public String getInfo(Customer customer, Trip trip, Address address) {
        String S1 = trip.getInfo(trip);
        String S2 = address.getInfo(address);
        String totalInfo = S1 + S2;
        return totalInfo;
    }


}
